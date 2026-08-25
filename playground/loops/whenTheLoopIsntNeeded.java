/*
* Difficulty: Level 5 Concepts tested: Recognizing when a loop can be simplified or eliminated Problem statement: You are given this loop-based solution to "compute the sum of the first n positive integers":

long sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}

(1) Derive the closed-form arithmetic expression that computes the same sum without any loop, and state it precisely (including correct handling of integer vs. floating-point intermediate division — the classic Gauss sum formula divides by 2, and you must ensure that division never loses precision for any valid n). (2) State the exact conditions under which replacing the loop with your closed-form expression is a strictly better engineering choice (consider both extremely large n and code-readability tradeoffs), and one condition under which you might deliberately keep the loop despite the formula existing (e.g. if the loop body needed to do additional per-iteration work beyond summation, the formula wouldn't apply). (3) Read one integer n and print your closed-form result, using only long arithmetic, verifying it produces identical output to the loop version for at least the three examples below. Input format: One integer n. Output format: Your closed-form formula (stated in words or math notation), your two-part reasoning from (2), then the computed value for the given n. Constraints: 1 ≤ n ≤ 2×10^9 (large enough that the loop version would be noticeably slower — this is the point) Examples:

Input: 5 → 15
Input: 1000000000 → 500000000500000000
Input: 1 → 1 Important edge cases: The formula n * (n + 1) / 2 must have its multiplication done in a type wide enough to avoid overflow before the division happens (doing the division too early, or in too narrow a type, silently corrupts the result for large n). What it specifically tests: The meta-skill of recognizing that a correct, working loop is not automatically the best solution — deliberately connecting back to Operators (precise integer arithmetic, overflow-safe ordering of multiply-then-divide) as the final bridge between the two topics this curriculum covers.
* */