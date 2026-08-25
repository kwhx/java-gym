#!/bin/bash
if [ $# -eq 0 ]; then
    rm -rf out
    mkdir -p out
    javac -d out $(find src -name "*.java")
    if [ $? -ne 0 ]; then
        echo "Compilation failed. Fuh the water gng"
        exit 1
    fi
    java -cp out Main
    exit 0
fi

TARGET="$1"
if [ -f "$TARGET" ]; then
    FILE="$TARGET"
else
    MATCHES=$(find src exercises \
        -name "$(basename "$TARGET")" \
        -type f 2>/dev/null)
    COUNT=$(echo "$MATCHES" | grep -c .)
    if [ "$COUNT" -eq 0 ]; then
        echo "Could not find Java file: $TARGET"
        exit 1
    elif [ "$COUNT" -gt 1 ]; then
        echo "Multiple files found:"
        echo "$MATCHES"
        echo "Use a unique filename."
        exit 1
    fi
    FILE="$MATCHES"
fi

CLASS=$(basename "$FILE" .java)
echo "Running: $FILE"
echo

rm -rf /tmp/javapractice-run
mkdir -p /tmp/javapractice-run
javac -d /tmp/javapractice-run "$FILE"

if [ $? -ne 0 ]; then
    echo "Compilation failed. Fuh the water gng"
    exit 1
fi

java -cp /tmp/javapractice-run "$CLASS"