#!/usr/bin/env bash
set -ex

for NUMBER in {1..100}
do
    wget \
        "https://projecteuler.net/minimal=$NUMBER"  \
        -O "problem_$(printf %03d $NUMBER)_minimal.html"
done

