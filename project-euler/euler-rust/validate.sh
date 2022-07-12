#!/bin/bash -ex

cargo check
cargo clippy -- --deny "warnings"
cargo test
