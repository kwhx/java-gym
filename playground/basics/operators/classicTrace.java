/*
* Difficulty: Level 3 Concepts tested: Prefix/postfix combined, evaluation order, side effects Problem statement: Read one integer x. Trace this line exactly as the JLS defines it (left operand of + is evaluated and its value captured before the right operand is evaluated):

x = x++ + ++x;

Print the final value of x. Input format: One integer x. Output format: One integer. Constraints: -20 ≤ x ≤ 20 Examples:

Input: 5 → 12
Input: 0 → 2
Input: -3 → -4 Important edge cases: None numerically special — the trap is purely about evaluation-order reasoning, not the specific value of x. What it specifically tests: Whether you can trace, step by step, that x++ captures x's value before incrementing, that the increment still happens (mutating the shared variable) before the right operand is evaluated, and that the final assignment to x overwrites whatever the intermediate increments produced — a canonical "don't write code like this, but you must be able to read it" exercise.
* */