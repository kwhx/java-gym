/*
* Difficulty: Level 4 Concepts tested: Integer division reasoning with sign traps Problem statement: Read two integers a and b (b ≠ 0). Using only integer arithmetic operators (no Math.ceil, no double, no loop), compute ceil(a / b) as true mathematical division would define it — e.g. ceil(7/2) = 4... wait, verify your own math: ceil(7/2) should be 4? Recompute: 7/2 = 3.5, so ceil = 4. Handle all four sign combinations of a and b correctly. Input format: Two integers a b. Output format: One integer. Constraints: -10^9 ≤ a, b ≤ 10^9, b ≠ 0 Examples:

Input: 7 2 → 4
Input: -7 2 → -3
Input: 7 -2 → -3
Input: -7 -2 → 4 Important edge cases: All four sign combinations of (a, b) behave differently under naive formulas — a formula that works for positive/positive will silently misbehave for the others if you don't handle sign explicitly. What it specifically tests: Deep understanding of integer-division truncation-toward-zero behavior in Java and the ability to build a sign-correct ceiling-division formula from it — a genuinely common CP building block.
* */