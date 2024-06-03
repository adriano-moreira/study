FROM rust:1.78 as builder

ENV RUSTFLAGS='-C target-cpu=native'

WORKDIR /app
RUN cargo init --name rust-axum-url-shortener
COPY Cargo.toml Cargo.lock /app/
RUN cargo build --release

COPY . .
RUN touch src/main.rs
RUN cargo build --release

FROM debian:12-slim AS runtime
COPY --from=builder /app/target/release/rust-axum-url-shortener /rust-axum-url-shortener
ENTRYPOINT ["/rust-axum-url-shortener"]