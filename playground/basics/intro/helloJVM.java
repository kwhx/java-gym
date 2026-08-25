/*
* Exercise 1.1 — Hello, JVM Difficulty: Trivial Concepts tested: main() signature, System.out.println, compile → run pipeline

Problem statement: Write a single Java class in a file named HelloJVM.java. When compiled and run, it must print exactly one line of text: Java program executed successfully.

Input format: None. Output format: Exactly one line, exact text, no extra spaces or punctuation. Constraints: File name must match the public class name.

Examples:

Run → Output: Java program executed successfully.
(No variation possible — deterministic single-output program.)
Compiling with a mismatched filename should fail — verify this by intentionally renaming the file once and observing the compiler error.

Edge cases to consider: What happens if the class is not declared public? What happens if the filename doesn't match the class name at all (not just case)? What this tests: That you can produce a program that actually compiles and runs, and that you understand the filename/class-name contract, not just copy a template.
* */