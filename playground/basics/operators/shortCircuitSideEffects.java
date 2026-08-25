/*
* Difficulty: Level 3 Concepts tested: Short-circuit evaluation, side effects, evaluation order Problem statement: Read one integer x. Trace this exact sequence of statements by hand (don't just guess):

int a = x;
boolean r1 = (a > 0) && (a++ > 0);
int afterFirst = a;
boolean r2 = (a < 0) || (a++ > 0);
int afterSecond = a;

Print r1, afterFirst, r2, afterSecond on separate lines, for the given x. Input format: One integer x. Output format: Four lines. Constraints: -10 ≤ x ≤ 10 Examples:

Input: 5 → true, 6, true, 7
Input: -5 → false, -5, true, -4
Input: 0 → false, 0, true, 1 Important edge cases: x = 0 (first condition is false, so the ++ inside &&'s right operand must not fire — this is the crux of the exercise). What it specifically tests: Whether you correctly predict that short-circuiting skips evaluation entirely (not just skips the boolean result) — meaning side effects like ++ genuinely don't happen when the left operand short-circuits the expression.
* */