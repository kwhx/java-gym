/*
* Difficulty: Level 1 Concepts tested: ++ / -- prefix vs. postfix Problem statement: Read one integer x. Perform these steps in order, printing the stated value at each step:

Print x++ (then show x afterward on the same line, separated by a space).
Print ++x (then show x afterward, separated by a space).
Print x-- (then show x afterward, separated by a space).
Print --x (then show x afterward, separated by a space). Input format: One integer x. Output format: Four lines, each expressionValue xAfter. Constraints: -100 ≤ x ≤ 100 Examples:
Input: 5 → 5 6, 7 7, 7 6, 5 5
Input: 0 → 0 1, 2 2, 2 1, 0 0
Input: -3 → -3 -2, -1 -1, -1 -2, -3 -3 Important edge cases: Starting at 0 and at negative values — the mechanics don't change, but it's worth confirming you're not assuming special-casing around zero. What it specifically tests: Whether you can separate "value of the expression" from "value of the variable after the statement" for both prefix and postfix forms.
* */