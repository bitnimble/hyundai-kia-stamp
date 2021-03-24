#!/bin/bash

libs="$BASE_PATH/lib/hyundai/x86_64"

echo $BASE_PATH
echo $libs
LD_LIBRARY_PATH=$libs java -Djava.library.path=$libs -jar $BASE_PATH/target/main-1.0.jar