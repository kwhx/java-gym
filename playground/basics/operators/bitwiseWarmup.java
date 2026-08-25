/*
* Difficulty: Level 1 Concepts tested: & | ^ ~ << >> >>> Problem statement: Read two non-negative integers a and b. Print, one per line: a & b, a | b, a ^ b, ~a, a << 2, a >> 1, a >>> 1. Input format: Two integers, space-separated. Constraints: 0 ≤ a, b ≤ 10^6 Examples:

Input: 12 10 → 8, 14, 6, -13, 48, 6, 6
Input: 0 5 → 0, 5, 5, -1, 0, 0, 0
Input: 7 7 → 7, 7, 0, -8, 28, 3, 3 Important edge cases: ~a on a non-negative number produces a negative result — this is expected, not a bug (two's-complement bitwise NOT). a = 0 for ~a gives -1. What it specifically tests: Raw familiarity with each bitwise/shift operator's output on plain values, including recognizing that ~ always flips the sign for non-negative input.
* */