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
    MATCHES=$(find . \
        -type f \
        -name "$(basename "$TARGET")" \
        -not -path './out/*' \
        -not -path './.git/*' \
        -not -path './node_modules/*' \
        2>/dev/null)

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

echo "Running: $FILE"
echo

rm -rf /tmp/javapractice-run
mkdir -p /tmp/javapractice-run

javac -d /tmp/javapractice-run "$FILE"

if [ $? -ne 0 ]; then
    echo "Compilation failed. Fuh the water gng"
    exit 1
fi

MAIN_CLASS=""

while IFS= read -r CLASS_FILE; do
    CLASS_NAME=$(basename "$CLASS_FILE" .class)

    if javap -classpath /tmp/javapractice-run "$CLASS_NAME" 2>/dev/null \
        | grep -q 'public static void main(java.lang.String\[\]);'; then
        MAIN_CLASS="$CLASS_NAME"
        break
    fi
done < <(find /tmp/javapractice-run -maxdepth 1 -name "*.class" -type f)

if [ -z "$MAIN_CLASS" ]; then
    echo "Could not find a class containing main() in: $FILE"
    exit 1
fi

java -cp /tmp/javapractice-run "$MAIN_CLASS"