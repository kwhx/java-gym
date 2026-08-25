/*
* Difficulty: Level 5 Concepts tested: Everything — arithmetic, bitwise, ternary, comparison, increment, precedence, associativity, side effects Problem statement: Read one integer x. Trace this block exactly, statement by statement, noting every intermediate value:

int a = x;
int b = (a > 0) ? a++ : --a;
int c = (a & 1) == 0 ? a << 1 : a >> 1;
boolean d = (b > c) && (c++ > 0);
int e = a + b + c;

Print a, b, c, d, e — one per line, in that order — as their final values after the whole block executes. Input format: One integer x. Output format: Five lines. Constraints: -10 ≤ x ≤ 10, x ≠ 0 Examples:

Input: 3 → work through it by hand; verify a=4, b=3, c=9, d=true, e=16 — recompute yourself before trusting this, that's the point of the exercise.
Input: -3 → trace independently.
Input: 1 → trace independently. Important edge cases: The sign of x changes which ternary branch fires in line 2, which changes everything downstream — small input differences should produce structurally different traces, not just different numbers. What it specifically tests: Whether you can hold multiple interacting operator behaviors in your head simultaneously and trace a nontrivial block line-by-line without running it — the core "reason about execution without a debugger" skill this curriculum is building toward.
* */