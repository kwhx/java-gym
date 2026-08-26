/*
* Exercise 1.6 — Modifying State Across Multiple Calls

Difficulty: Beginner Concepts Tested: state persisting and accumulating across separate calls on the same object

Problem Statement: Using increaseBy (as in 1.4, no return value), read an initial count and three separate amounts. Call increaseBy three times in sequence, printing the current count after each individual call (three lines total).

Input Format: int initialCount, then three ints amount1, amount2, amount3 Output Format: three lines, Count is: <count>, one per call Constraints: -1000 <= all values <= 1000

Examples:

0, 5, 5, 5 → Count is: 5 / Count is: 10 / Count is: 15
20, -5, 0, 10 → Count is: 15 / Count is: 15 / Count is: 25
100, 0, 0, 0 → Count is: 100 / Count is: 100 / Count is: 100

Important Edge Cases: a 0 amount partway through the sequence (must not change the count between that step and the next).

This Exercise Tests: that object state persists across separate method invocations on the same object — the field is never reset between calls.
* */