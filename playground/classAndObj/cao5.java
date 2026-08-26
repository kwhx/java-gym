/*
* Exercise 1.5 — A Method With a Return Value

Difficulty: Beginner Concepts Tested: a method that computes and returns a value without mutating state, capturing a returned value in the caller

Problem Statement: Add a method doubleValue that takes no parameters, computes twice the current count, and returns that value as an int — without changing the field. Read an initial count, create the object, call the method, store the returned value in a local variable in main, and print both the original field and the returned value.

Input Format: int initialCount Output Format: two lines: Original: <count> and Doubled: <returned value> Constraints: -1000 <= initialCount <= 1000

Examples:

5 → Original: 5 / Doubled: 10
0 → Original: 0 / Doubled: 0
-4 → Original: -4 / Doubled: -8

Important Edge Cases: confirming count is genuinely unchanged after the call — printing it again should show the original value, not the doubled one.

This Exercise Tests: the difference between a method that computes and returns a value and one that mutates state — and that a caller must explicitly capture a returned value to use it.
* */