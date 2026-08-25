/*
* Difficulty: Intermediate-Advanced Concepts Tested: validity gating, multi-stage classification, finding a max among three values without arrays, permutation-aware compound conditions

Problem Statement: Given three positive integer side lengths, first determine if they form a valid triangle (the sum of any two sides must strictly exceed the third). If invalid → NOT A TRIANGLE. If valid, classify by side equality: all three equal → EQUILATERAL; exactly two equal → ISOSCELES; all different → SCALENE. Additionally, check (independently) whether it's a right triangle (using whichever side is largest as the hypotenuse), and if so append  - RIGHT to the classification.

Input Format: three ints a b c on one line Output Format: one line, e.g. SCALENE - RIGHT, EQUILATERAL, or NOT A TRIANGLE Constraints: 1 <= a,b,c <= 10000

Examples:

3 4 5 → SCALENE - RIGHT
5 5 5 → EQUILATERAL
1 1 5 → NOT A TRIANGLE
5 5 8 → ISOSCELES

Important Edge Cases: a degenerate case where a + b == c exactly (must be NOT A TRIANGLE — the inequality is strict); a right-triangle check must correctly identify the largest side as the candidate hypotenuse regardless of input order (e.g., 5 3 4 should still detect a right triangle). This Exercise Tests: multi-stage gated classification, and manually determining the maximum of three values via if/else (no arrays/sorting available yet).
* */