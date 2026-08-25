/*
* Difficulty: Level 4 Concepts tested: Digit manipulation via %//, negative-number handling Problem statement: Read one integer n (which may be negative). Compute the sum of its digits (ignoring sign) using only arithmetic — no conversion to String, no arrays. Print the result. Input format: One integer n. Output format: One integer. Constraints: -2×10^9 ≤ n ≤ 2×10^9 (note: this exceeds plain int range at the extremes — choose your working type carefully, especially for Integer.MIN_VALUE-adjacent values where naive sign-flipping overflows) Examples:

Input: 12345 → 15
Input: -999 → 27
Input: 0 → 0 Important edge cases: n = 0 (loop must still produce 0, not skip entirely due to a naive while (n != 0) that never enters when n starts at 0); very negative n near Integer.MIN_VALUE where negating it directly would overflow. What it specifically tests: Correct loop-based digit extraction (n % 10, n /= 10) with special handling for n = 0 as a base case and for sign/overflow at extreme negative values.
* */