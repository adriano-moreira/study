use axum::{
    self,
    Form,
    Router,
    extract::{Path, State},
    http::StatusCode,
    response::{IntoResponse, Redirect},
    routing::{get, post}
};
use bb8::Pool;
use bb8_postgres::PostgresConnectionManager;
use serde::Deserialize;
use tokio_postgres::NoTls;

#[tokio::main]
async fn main() {
    println!("starting server...");

    let connection_string = std::env::var("PG_CONNECTION_STRING")
        .unwrap_or(String::from("host=localhost user=admin password=admin dbname=url_shortener"));

    let manager = PostgresConnectionManager::new_from_stringlike(connection_string, NoTls)
        .unwrap();

    let pool = Pool::builder()
        .build(manager)
        .await
        .unwrap();

    let app = Router::new()
        .route("/", get(get_root))
        .route("/", post(create_alias))
        .route("/:alias", get(from_alias))
        .with_state(pool);

    let listener = tokio::net::TcpListener::bind("0.0.0.0:3000")
        .await.unwrap();

    axum::serve(listener, app).await.unwrap();
}

async fn get_root() -> impl IntoResponse {
    String::from("Rust/Axum HTTP Server")
}

type ConnectionPool = Pool<PostgresConnectionManager<NoTls>>;

#[derive(Deserialize, Debug)]
struct CreateAliasInput {
    alias: String,
    url: String,
}

async fn create_alias(
    State(pool): State<ConnectionPool>,
    Form(input): Form<CreateAliasInput>,
) -> Result<StatusCode, (StatusCode, String)> {
    let conn = pool.get()
        .await
        .map_err(internal_error)?;

    conn.execute(
        "insert into shortener(alias,url) values($1,$2)",
        &[&input.alias, &input.url])
        .await
        .map_err(internal_error)?;

    Ok(StatusCode::OK)
}

async fn from_alias(
    State(pool): State<ConnectionPool>,
    Path(alias): Path<String>,
) -> Result<impl IntoResponse, (StatusCode, String)> {
    let conn = pool.get().await.map_err(internal_error)?;

    let rows = conn.query(
        "select url from shortener where alias = $1",
        &[&alias])
        .await
        .map_err(internal_error)?;

    if rows.is_empty() {
        return Err((StatusCode::NOT_FOUND, String::from("not found")));
    }

    let url: &str = rows[0].get(0);
    Ok(Redirect::permanent(url))
}

fn internal_error<E>(err: E) -> (StatusCode, String)
    where E: std::error::Error,
{
    (StatusCode::INTERNAL_SERVER_ERROR, err.to_string())
}