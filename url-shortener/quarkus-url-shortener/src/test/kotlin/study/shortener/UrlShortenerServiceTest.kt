package study.shortener

import io.quarkus.hibernate.reactive.panache.common.WithSession
import io.quarkus.test.junit.QuarkusTest
import io.quarkus.vertx.VertxContextSupport
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import org.junit.jupiter.api.Test

@QuarkusTest
class UrlShortenerServiceTest {

    @Inject
    @field:Default
    lateinit var service: UrlShortenerService

    @Test
    fun testCreate() {
        val create = VertxContextSupport.subscribeAndAwait {
            service.create("gg", "http://google.com")
        }
    }

}