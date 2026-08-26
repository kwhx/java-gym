/*
* Exercise 2.3 — Modeling a Student Record

Difficulty: Intermediate Concepts Tested: stored state vs. a value that must always be freshly computed, never stored

Problem Statement: Design a class representing a student with a name and three test scores. Provide a method that computes and returns the average of the three scores as a double, and another returning "PASS" if the average is at least 40, else "FAIL". Read a name and three scores, set up the object, print the name, the average (2 decimal places), and the pass/fail result.

Input Format: String name, int score1, int score2, int score3 Output Format: three lines Constraints: 0 <= score1,score2,score3 <= 100

Examples:

"Kai", 80, 70, 90 → Kai / Average: 80.00 / PASS
"Ren", 30, 30, 30 → Ren / Average: 30.00 / FAIL
"Uma", 40, 40, 40 → Uma / Average: 40.00 / PASS

Important Edge Cases: the average landing exactly on the 40 boundary.

This Exercise Tests: choosing which values belong as stored state (the three scores) versus which belong purely as computed behavior (the average must never itself be a field, or it could drift out of sync).
* */