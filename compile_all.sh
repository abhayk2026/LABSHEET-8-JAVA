#!/usr/bin/env bash
set -e
cd "$(dirname "$0")/src"
javac *.java
echo "Compilation successful."
