/*
* Difficulty: Level 2 Concepts tested: Applied bitwise reasoning Problem statement: Read one positive integer n. Using only bitwise operators (no loops, no Math methods, no %), determine and print whether n is a power of two. (Hint-free note: think about what n & (n - 1) does to the lowest set bit.) Input format: One integer n. Output format: true or false. Constraints: 1 ≤ n ≤ 2^30 Examples:

Input: 16 → true
Input: 18 → false
Input: 1 → true Important edge cases: n = 1 (2^0, should be true); a large non-power like 2^30 - 1. What it specifically tests: Whether you can reason about bit patterns directly rather than falling back to arithmetic/looping approaches.
* */