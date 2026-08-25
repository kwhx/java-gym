/*
* Difficulty: Level 4 Concepts tested: Compound boolean logic, boundary-inclusive comparisons Problem statement: Read four integers s1 e1 s2 e2 describing two closed integer ranges [s1, e1] and [s2, e2] (each guaranteed s ≤ e). Print true if the ranges overlap (share at least one integer, boundaries inclusive) and false otherwise — as a single boolean expression, no loop. Input format: Four integers, space-separated. Output format: true or false. Constraints: -10^9 ≤ s1, e1, s2, e2 ≤ 10^9, s1 ≤ e1, s2 ≤ e2 Examples:

Input: 1 5 5 10 → true (touch at 5)
Input: 1 5 6 10 → false
Input: -3 -1 -1 2 → true Important edge cases: Ranges that touch at exactly one boundary point (must count as overlapping); one range fully contained inside the other. What it specifically tests: Correctly formulating "not disjoint" as a boolean expression (s1 ≤ e2 && s2 ≤ e1) rather than overcomplicating with multiple cases, and handling inclusive boundaries precisely.
* */