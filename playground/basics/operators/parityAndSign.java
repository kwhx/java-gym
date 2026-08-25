/*
* Difficulty: Level 4 Concepts tested: Bitwise parity trick, ternary sign check, extreme values Problem statement: Read one integer n, which may equal Integer.MIN_VALUE. Using n & 1 (not %), print even or odd. Then, without using Math.signum and without an if statement, print -1, 0, or 1 representing the sign of n, using a nested ternary. Input format: One integer n. Output format: Two lines: parity word, then sign integer. Constraints: -2^31 ≤ n ≤ 2^31 - 1 (i.e. the full int range, including Integer.MIN_VALUE) Examples:

Input: -2147483648 → even, -1
Input: 0 → even, 0
Input: 7 → odd, 1 Important edge cases: Integer.MIN_VALUE — note that Math.abs(Integer.MIN_VALUE) would itself overflow, which is exactly why this exercise steers you toward n & 1 and a ternary instead of arithmetic tricks that break at this boundary. What it specifically tests: Whether the bitwise parity trick is used correctly on a negative extreme value (it still works because & 1 only inspects the lowest bit, unaffected by sign), and whether sign logic avoids overflow-prone approaches.
* */