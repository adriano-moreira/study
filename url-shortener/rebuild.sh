#!/bin/bash
set -ex

cd quarkus-url-shortener
quarkus build
docker build . --file src/main/docker/Dockerfile.jvm  --tag quarkus-url-shortener:jvm
cd -

cd rust-axum-url-shortener
docker build . -t rust-axum-url-shortener
cd -