/*
* Difficulty: Level 1 Concepts tested: == != > < >= <=, && || !, boolean-valued expressions Problem statement: Read three integers a, b, c. Print the boolean result (true/false) of each of the following expressions, one per line: a == b, a != c, (a < b) && (b < c), (a > b) || (b > c), !(a == c). Input format: Three integers, space-separated. Output format: Five lines of true or false. Constraints: -100 ≤ a, b, c ≤ 100 Examples:

Input: 1 2 3 → false, true, true, false, true
Input: 5 5 5 → true, false, false, false, false
Input: 10 1 10 → false, false, false, true, false Important edge cases: All three values equal; values where the comparison chain is false in both directions. What it specifically tests: That comparisons produce genuine boolean values and that &&/||/! combine them correctly.
* */