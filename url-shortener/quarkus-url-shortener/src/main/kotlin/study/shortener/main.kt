package study.shortener

import io.quarkus.hibernate.reactive.panache.PanacheRepositoryBase
import io.quarkus.hibernate.reactive.panache.common.WithSession
import io.quarkus.hibernate.reactive.panache.common.WithTransaction
import io.smallrye.mutiny.Uni
import io.smallrye.mutiny.replaceWithUnit
import jakarta.enterprise.context.ApplicationScoped
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import java.net.URI

@Entity
@Table(name = "shortener")
class UlrAliased {

    @Id
    var alias: String? = null
    var url: String? = null

}

@ApplicationScoped
class UrlAliasedRepository : PanacheRepositoryBase<UlrAliased, String>

@ApplicationScoped
class UrlShortenerService(
    private val urlAliasedRepository: UrlAliasedRepository,
) {
    fun create(alias: String, url: String): Uni<Unit> {
        val e = UlrAliased()
        e.alias = alias
        e.url = url
        return urlAliasedRepository
            .persist(e)
            .replaceWithUnit()
    }

    fun get(alias: String): Uni<UlrAliased?> {
        return urlAliasedRepository
            .findById(alias)
    }
}

@Path("")
class UrlShortenerResource(
    private val urlAliasedService: UrlShortenerService
) {
    @POST
    @WithTransaction
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    fun create(
        @FormParam("alias") alias: String,
        @FormParam("url") url: String,
    ): Uni<Response> {
        return urlAliasedService
            .create(alias, url)
            .map { Response.ok().build() }
    }

    @GET
    @WithSession
    @Path("/{alias}")
    fun get(@PathParam("alias") alias: String): Uni<Response> {
        return urlAliasedService
            .get(alias)
            .map {
                if (it == null) {
                    Response.status(Response.Status.NOT_FOUND).build()
                }
                Response
                    .status(Response.Status.PERMANENT_REDIRECT)
                    .location(URI.create(it?.url!!)).build()
            }
    }
}
