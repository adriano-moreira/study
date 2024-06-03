#!/bin/bash
set -e

cd stress-test

lscpu | grep 'Model name:'

# 5 iterations because java warm-up
for (( i=0 ; i < 5 ; i++ ))
do
    ./k6.sh run -e HOST='http://127.0.0.1:8080' k6-stress-test.js --duration 5s --vus 20
    sleep 1
done

./k6.sh run -e HOST='http://127.0.0.1:8080' k6-stress-test.js --duration 20s --vus 10
./k6.sh run -e HOST='http://127.0.0.1:3000' k6-stress-test.js --duration 20s --vus 10

