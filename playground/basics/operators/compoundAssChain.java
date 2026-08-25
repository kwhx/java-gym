/*
* Difficulty: Level 1 Concepts tested: += -= *= /= %= Problem statement: Read one integer x. Apply the following operations in order and print x after every operation on its own line: add 5, multiply by 3, subtract 4, integer-divide by 2, take remainder with 7. Input format: One integer x. Output format: Five lines, the value of x after each step. Constraints: -50 ≤ x ≤ 50 Examples:

Input: 2 → Output: 7, 21, 17, 8, 1
Input: 0 → Output: 5, 15, 11, 5, 5
Input: -10 → Output: -5, -15, -19, -9, -2 (check the last two carefully — negative integer division and remainder) Important edge cases: Negative intermediate values feeding into /= and %=. What it specifically tests: Correct sequential state mutation using compound assignment, including compound division/remainder on negative values.
* */