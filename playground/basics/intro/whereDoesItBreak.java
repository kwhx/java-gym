/*
* Problem statement: You're given two broken snippets. For each, state (a) whether it fails at compile time or run time, and (b) why, referencing what javac checks vs what only the JVM can catch.

Snippet A:

java
public class SnippetA {
    public static void main(String[] args) {
        int x = 5
        System.out.println(x);
    }
}

Snippet B:

java
public class SnippetB {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[5]);
    }
}

Input format: None — this is an analysis exercise. Write your answer as comments or a short text file alongside your understanding; no runnable output is required, but you're encouraged to verify both empirically. Output format: A one- or two-sentence justification per snippet. Constraints: N/A.

Examples: N/A (this is not a program with sample I/O — verify by actually compiling and running both). Edge cases to consider: Would Snippet B's problem ever be catchable by javac in principle? Why not? What this tests: Whether you can separate "the compiler understood the shape of my code" from "the compiler understood what my code does."
* */