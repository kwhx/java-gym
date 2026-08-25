/*
* Difficulty: Level 4 Concepts tested: Modulo reasoning, no loops Problem statement: A number is "digit-friendly" if reducing it to n % 9 (with the special rule that a nonzero multiple of 9 maps to 9, not 0) produces a single-digit value consistent with its digital root — but you are not asked to compute the digital root. Instead: read one positive integer n. Without any loop, print 9 if n is a positive multiple of 9, otherwise print n % 9. Input format: One integer n. Output format: One integer. Constraints: 1 ≤ n ≤ 10^18 (fits in long, not int — choose your type carefully) Examples:

Input: 18 → 9
Input: 20 → 2
Input: 999999999999999999 → 9 Important edge cases: Values that overflow int — this problem forces you to notice and use long. What it specifically tests: Correct choice of primitive type for the given constraint range, and precise modulo/ternary logic without resorting to a loop.
* */