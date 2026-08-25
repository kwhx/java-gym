/*
* Difficulty: Level 2 Concepts tested: Nested loops, row/column relationship reasoning Problem statement: Read one integer n. Print a right triangle of * characters with n rows, where row i (1-indexed) contains exactly i stars, using nested loops (outer loop = rows, inner loop = stars per row). No arrays, no pre-built strings of stars — build it character by character. Input format: One integer n. Output format: n lines, line i containing i * characters (no spaces). Constraints: 1 ≤ n ≤ 50 Examples:

Input: 3 → *, **, ***
Input: 1 → *
Input: 4 → *, **, ***, **** Important edge cases: n = 1 (single row, single star — verify the inner loop bound is i, not n, or every row would be full-width). What it specifically tests: Whether the inner loop's bound correctly depends on the outer loop's current variable, not a fixed constant — the core nested-loop reasoning skill.
* */