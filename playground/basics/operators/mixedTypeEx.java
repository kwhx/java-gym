/*
* Difficulty: Level 2 Concepts tested: Implicit promotion, char arithmetic, integer vs. floating-point division Problem statement: Read a lowercase letter c and an integer n. Compute and print: (1) the character obtained by shifting c forward by n letters within the lowercase alphabet, wrapping around from z back to a (use arithmetic on the char's underlying int value plus %, then cast back to char); (2) the double value of (int)c / (double)n if n ≠ 0, else print undefined. Input format: A character c and an integer n, space-separated. Output format: Two lines: the shifted character, then the division result (or undefined). Constraints: c is a lowercase English letter, -50 ≤ n ≤ 50 Examples:

Input: y 3 → b, 48.7... (some decimal — verify your own arithmetic)
Input: a 0 → a, undefined
Input: a -1 → z, some decimal Important edge cases: Negative shift amounts (should wrap backward, not throw or misbehave); n = 0 for the division part; wraparound exactly at z→a. What it specifically tests: Comfort treating char as a numeric type for arithmetic, correct modulo-based wraparound (including with a negative shift), and remembering to cast for true floating-point division.
* */