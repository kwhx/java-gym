/*
* Difficulty: Intermediate Concepts Tested: short-circuit evaluation as a safety mechanism, condition ordering

Problem Statement: Read two ints a, b. If b != 0 and a / b >= 0, print NON-NEGATIVE RESULT. Else if b != 0 (but the division was negative), print NEGATIVE RESULT. Else (b == 0), print DIVISION BY ZERO. The condition must be ordered so the zero-check happens before any division is attempted.

Input Format: int a, int b Output Format: one line Constraints: -1000 <= a,b <= 1000

Examples:

a=10, b=2 → NON-NEGATIVE RESULT
a=-7, b=3 → NEGATIVE RESULT
a=5, b=0 → DIVISION BY ZERO

Important Edge Cases: a=0, b=5 → 0/5 = 0, which is non-negative → NON-NEGATIVE RESULT. a=0, b=0 must still be caught as DIVISION BY ZERO before any division is attempted.

This Exercise Tests: using &&'s short-circuit behavior deliberately to prevent a runtime exception, not just as a logical connective.
* */