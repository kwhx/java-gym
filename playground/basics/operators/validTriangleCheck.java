/*
* Difficulty: Level 2 Concepts tested: Compound boolean expressions, parentheses, &&/|| Problem statement: Read three integers representing side lengths. Print true if they can form a valid triangle (each side strictly less than the sum of the other two, all sides positive) and false otherwise. Do it as a single boolean expression assigned to one variable — no if. Input format: Three integers, space-separated. Output format: true or false. Constraints: -100 ≤ sides ≤ 100 (note: sides may be given as non-positive to test your validity check) Examples:

Input: 3 4 5 → true
Input: 1 1 3 → false
Input: 0 4 5 → false Important edge cases: A "degenerate triangle" where one side exactly equals the sum of the other two (should be false, strict inequality); a zero or negative side. What it specifically tests: Building a correct multi-clause boolean expression with proper precedence between && and ||, and not forgetting the positivity check.
* */