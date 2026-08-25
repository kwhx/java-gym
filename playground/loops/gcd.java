/*
* Difficulty: Level 4 Concepts tested: Euclidean-style iterative loop, edge-case value handling Problem statement: Read two integers a and b (not both zero). Compute their greatest common divisor using a while loop and the modulo operator (the Euclidean algorithm), without recursion. Handle negative inputs by working with their absolute values first. Input format: Two integers a b. Output format: One non-negative integer (the GCD). Constraints: -10^9 ≤ a, b ≤ 10^9, not both zero Examples:

Input: 48 18 → 6
Input: 0 5 → 5
Input: -12 8 → 4 Important edge cases: One of the two values being 0 (GCD should just be the absolute value of the other); both values negative. What it specifically tests: Correct iterative (not recursive) implementation of a while-loop swap-and-modulo pattern, plus proper input sanitization (absolute value) before the core loop logic runs.
* */