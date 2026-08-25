/*
* Difficulty: Level 2 Concepts tested: Multiple loop variables via comma operator Problem statement: Read one integer n. Using a single for loop with two loop variables initialized, updated, and checked together (comma-separated in the for header — e.g. for (int i = 0, j = n - 1; i < j; i++, j--)), print pairs i j for every step until the variables cross or meet. Input format: One integer n. Output format: One line per step: i j. Constraints: 1 ≤ n ≤ 100 Examples:

Input: 6 → 0 5, 1 4, 2 3
Input: 5 → 0 4, 1 3
Input: 1 → (no output — i and j start already crossed/equal) Important edge cases: n = 1 (loop body never executes because i < j is false immediately, i.e. 0 < 0); odd vs. even n determining whether the two indices meet exactly or cross past each other. What it specifically tests: Correct use of the comma operator to manage two loop variables in one for header, and correct reasoning about when converging indices stop (a pattern that generalizes to two-pointer techniques once arrays are introduced later).
* */