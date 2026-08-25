/*
* Difficulty: Level 1 Concepts tested: Reverse iteration, decrementing update Problem statement: Read one integer n (n ≥ 1). Print the integers from n down to 1, one per line, using a for loop with a decrementing update. Input format: One integer n. Output format: n lines, descending. Constraints: 1 ≤ n ≤ 1000 Examples:

Input: 4 → 4, 3, 2, 1
Input: 1 → 1
Input: 1000 → (1000 lines, descending) Important edge cases: n = 1 (loop still runs exactly once, not zero times). What it specifically tests: Correctly writing a descending loop's three parts (initialization at n, condition i >= 1, decrement i--) without accidentally reusing an ascending pattern.
* */