/*
* Exercise 1.7 — Passing One Object's Field Into Another Object's Method

Difficulty: Beginner Concepts Tested: the first genuine multi-object interaction — reading a value out of one object and using it as an argument to a method on a different object

Problem Statement: Define a class with a balance field (double) and a method deposit that takes an amount and adds it to balance (no return value). Create two objects, source and destination. Read a starting balance for each. Then read a withdrawal amount, subtract it directly from source's balance field (plain field access, not a method call), and pass that same amount into a call to destination.deposit(...). Print both accounts' final balances.

Input Format: double sourceStart, double destStart, double moveAmount Output Format: two lines: Source: <balance> and Destination: <balance>, each formatted to 2 decimal places Constraints: 0 <= sourceStart, destStart, moveAmount <= 100000

Examples:

500.0, 200.0, 150.0 → Source: 350.00 / Destination: 350.00
100.0, 0.0, 100.0 → Source: 0.00 / Destination: 100.00
50.0, 20.0, 80.0 → Source: -30.00 / Destination: 100.00

Important Edge Cases: moveAmount larger than sourceStart — this exercise does not require preventing that; the balance can legitimately go negative, since no validation logic exists yet.

This Exercise Tests: reading state out of one object and using it as an argument into a method call on a different object — a preview of the multi-object interactions built more fully in Level 5.
* */