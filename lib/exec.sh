#!/bin/bash

echo "Running in env: $(uname -m)"
libs="$BASE_PATH/lib/hyundai/x86_64"

LD_LIBRARY_PATH=$libs java -Djava.library.path=$libs -jar $BASE_PATH/target/main-1.0.jar