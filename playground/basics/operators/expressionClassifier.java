/*
* Difficulty: Level 4 Concepts tested: Nested ternary, compact multi-condition logic, no if Problem statement: Read one integer n. Using a single expression (nested ternaries only, no if/switch, no intermediate boolean variables), print an integer status code: 2 if n > 0 and even, 1 if n > 0 and odd, -2 if n < 0 and even, -1 if n < 0 and odd, 0 if n == 0. Input format: One integer n. Output format: One integer. Constraints: -10^6 ≤ n ≤ 10^6 Examples:

Input: 4 → 2
Input: -7 → -1
Input: 0 → 0 Important edge cases: n = 0 must short-circuit to 0 before parity is even considered; negative even/odd parity via % (remember the sign convention from Exercise O1). What it specifically tests: Whether you can compose five mutually exclusive outcomes into one correctly-nested ternary chain without logic errors or unreachable branches.
* */