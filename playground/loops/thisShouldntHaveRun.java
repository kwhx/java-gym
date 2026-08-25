/*
* Difficulty: Level 3 Concepts tested: do-while boundary trap Problem statement: Read one integer limit and a starting integer start. Compare these two loops' printed output for the same inputs:

// Loop A (while)
int i = start;
while (i > limit) { System.out.println(i); i--; }

// Loop B (do-while)
int i = start;
do { System.out.println(i); i--; } while (i > limit);

Predict, for the given start/limit, whether A and B produce identical output or diverge, and if they diverge, exactly what extra (or different) line B prints that A doesn't. Input format: Two integers start limit. Output format: Loop A's full output, then Loop B's full output, then one line: SAME or DIFFERENT. Constraints: -100 ≤ limit < start... or limit ≥ start (both relationships are valid inputs — that's the point) , values in [-1000, 1000] Examples:

Input: 5 2 → A prints 5 4 3, B prints 5 4 3 → SAME (condition starts true, no divergence)
Input: 2 5 → A prints nothing, B prints 2 → DIFFERENT
Input: 5 5 → A prints nothing, B prints 5 → DIFFERENT Important edge cases: start == limit and start < limit — both cases where the while's upfront check prevents any execution, but do-while runs exactly once regardless. What it specifically tests: Whether "at least one execution" is understood as a precise behavioral guarantee with concrete consequences, not just an abstract fact you can recite.
* */