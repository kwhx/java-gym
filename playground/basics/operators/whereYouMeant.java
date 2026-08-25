/*
* Difficulty: Level 3 Concepts tested: Bitwise-vs-logical operator confusion, side effects, short-circuit vs. non-short-circuit Problem statement: Read one integer x. Evaluate and print the final value of x after each of these two independent traces (start fresh from the input value each time):

// Trace 1
int x1 = x;
boolean r1 = (x1 > 100) & (x1++ > 0);
int after1 = x1;

// Trace 2
int x2 = x;
boolean r2 = (x2 > 100) && (x2++ > 0);
int after2 = x2;

Print after1 and after2. Input format: One integer x. Output format: Two integers, one per line. Constraints: -50 ≤ x ≤ 50 Examples:

Input: 5 → 6, 5
Input: 200 → 201, 201
Input: 100 → 101, 100 Important edge cases: x ≤ 100, where the left condition is false — this is exactly where & and && diverge in behavior. What it specifically tests: Whether you know & and | always evaluate both operands (no short-circuiting) even though they can operate on booleans, unlike &&/|| — a trap that silently changes program behavior when someone "simplifies" && to & out of habit from other contexts.
* */