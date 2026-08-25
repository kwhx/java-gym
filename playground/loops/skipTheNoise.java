/*
* Difficulty: Level 2 Concepts tested: continue, accumulator correctness under filtering Problem statement: Read one integer n, then read n integers one at a time. Using continue to skip any value that is negative or a multiple of 10, print the running sum of all values that were not skipped, and separately print how many values were skipped. Input format: n, then n integers (space- or newline-separated). Output format: Two lines: the sum of kept values, then the count of skipped values. Constraints: 1 ≤ n ≤ 10^4, each value in [-10^4, 10^4] Examples:

Input: 5 / 3 -2 20 7 15 → 25, 2 (kept: 3, 7, 15; skipped: -2, 20)
Input: 3 / 10 20 30 → 0, 3
Input: 2 / 1 2 → 3, 0 Important edge cases: A value that's both negative and a multiple of 10 (e.g. -20) should only be skipped once, not double-counted; all values skipped (sum stays 0). What it specifically tests: Correct placement of the accumulator update relative to the continue statement — a very common bug is updating a counter or sum either before the continue fires (wrongly including skipped values) or in a position continue jumps over entirely (silently dropping needed updates).
* */