/*
* Difficulty: Advanced Concepts Tested: switch combined with a shared guard applied to only some cases, spec-driven behavior over assumed language behavior

Problem Statement: Given a (double), operator (char: '+','-','*','/','%'), b (double). Compute and print RESULT: X.XX. For '/' and '%' specifically, if b == 0.0, print ERROR: DIVISION BY ZERO instead of performing the operation — this guard applies to both of those operators, even though Java's % on doubles with a zero divisor doesn't actually throw (it produces NaN); this problem's spec explicitly wants the guarded message regardless. Any other operator → ERROR: UNKNOWN OPERATOR.

Input Format: double a, char operator, double b Output Format: one line Constraints: any double a, b within reasonable range

Examples:

a=10, op='/', b=0 → ERROR: DIVISION BY ZERO
a=7, op='%', b=3 → RESULT: 1.00
a=5, op='^', b=2 → ERROR: UNKNOWN OPERATOR

Important Edge Cases: b=0 specifically with '%' (easy to assume "modulo by zero doesn't crash so no guard needed" — but the spec wants the explicit error message regardless of what the runtime would actually do); negative operands. This Exercise Tests: applying a shared guard condition to exactly the cases the spec requires (not all, not none), and following the written spec over assumed runtime behavior.
* */