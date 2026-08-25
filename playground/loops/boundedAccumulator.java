/*
* Difficulty: Level 1 Concepts tested: Accumulators, inclusive loop boundaries Problem statement: Read two integers lo and hi (lo ≤ hi). Compute and print the sum of all integers from lo to hi, inclusive, using a loop (not a formula). Input format: Two integers lo hi. Output format: One integer (or long if needed — check the constraints). Constraints: -10^5 ≤ lo ≤ hi ≤ 10^5 Examples:

Input: 1 5 → 15
Input: -3 3 → 0
Input: 5 5 → 5 Important edge cases: lo == hi (single-element sum); a range spanning negative to positive. What it specifically tests: Correct inclusive boundary handling in a loop condition (i <= hi, not i < hi) and correct accumulator initialization (starting at 0, not lo).
* */