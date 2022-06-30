#!/usr/bin/env bash
set -ex

for NUMBER in {001..100}
do
    wget "https://projecteuler.net/minimal=$NUMBER" -O "euler${NUMBER}.html"
done

