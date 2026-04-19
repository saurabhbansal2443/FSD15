#!/bin/bash

# Java Run Script - Compile and run any Java program

if [ $# -eq 0 ]; then
    echo "Usage: ./run.sh <ClassName>"
    echo "Example: ./run.sh linked.Implementation"
    echo "         ./run.sh array.Basics"
    exit 1
fi

CLASS_NAME="$1"
mkdir -p bin

echo "Compiling all Java files..."
javac -d bin -sourcepath src $(find src -name "*.java") 2>/dev/null

if [ $? -ne 0 ]; then
    echo "Compilation failed!"
    exit 1
fi

echo "✓ Compilation successful"
echo ""
echo "Running: $CLASS_NAME"
echo "-------------------"
java -cp bin "$CLASS_NAME"
echo "-------------------"
echo "✓ Done"
