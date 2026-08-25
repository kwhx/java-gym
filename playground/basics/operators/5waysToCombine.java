/*
* Difficulty: Level 1 Concepts tested: + - * / %, integer vs. floating-point division Problem statement: Read two integers a and b. Compute and print, each on its own line: their sum, difference, product, integer quotient (a / b using int division), and remainder (a % b). Then compute the quotient again but as a double (by casting appropriately) and print that too. Input format: Two integers on one line, space-separated: a b Output format: Six lines: sum, difference, product, int quotient, remainder, double quotient. Constraints: -1000 ≤ a, b ≤ 1000, b ≠ 0 Examples:

Input: 7 2 → Output: 9, 5, 14, 3, 1, 3.5
Input: -7 2 → Output: -5, -9, -14, -3, -1, -3.5
Input: 6 3 → Output: 9, 3, 18, 2, 0, 2.0 Important edge cases: Negative dividend with % (Java's remainder keeps the sign of the dividend); exact division producing .0 in the double case. What it specifically tests: Whether you can distinguish integer division from floating-point division and correctly cast to get the latter, and whether you understand Java's remainder sign convention.
* */