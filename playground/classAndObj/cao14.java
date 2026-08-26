/*
* Exercise 2.7 — Modeling an Employee Timesheet

Difficulty: Intermediate Concepts Tested: an accumulating field feeding a value that must always be freshly computed

Problem Statement: Design a class representing an employee with a name, an hourly rate, and total hours worked so far. Provide logHours (adds given hours to the total) and calculatePay, which returns rate × total hours, computed fresh each call rather than stored. Read a name, an hourly rate, and three hour-logging entries; after each logHours call, immediately call calculatePay and print the result.

Input Format: String name, double hourlyRate, then three doubles (hours to log) Output Format: three lines (pay after each logging step, 2 decimal places) Constraints: 0 <= hourlyRate <= 1000, 0 <= hours <= 1000

Examples:

"Sam", 20.0, 2, 3, 5 → Pay: 40.00 / Pay: 100.00 / Pay: 200.00
"Ivy", 15.5, 0, 4, 0 → Pay: 0.00 / Pay: 62.00 / Pay: 62.00
"Tom", 10.0, 1, 1, 1 → Pay: 10.00 / Pay: 20.00 / Pay: 30.00

Important Edge Cases: a logHours call with 0 hours (pay unchanged from before, but genuinely recomputed, not a stale stored value).

This Exercise Tests: correctly deciding that pay is a computed method, never a stored field that could drift out of sync — a direct extension of 2.3's judgment.
* */