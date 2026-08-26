/*
* Exercise 5.1 — Bank Account Command Processor

Difficulty: Advanced Concepts Tested: a single evolving object driven by a loop-based command interpreter, validation enforced inside a state-changing method

Problem Statement: Design an account-like class with a balance field and whichever methods you judge appropriate for depositing and withdrawing. Read a starting balance, then commands one per line until DONE: each is DEPOSIT <amount> or WITHDRAW <amount>. Process each via the appropriate method on a single object, printing the resulting balance after each command. A WITHDRAW that would take the balance below 0 must be rejected — print INSUFFICIENT FUNDS instead, leaving the balance unchanged.

Input Format: double startingBalance, then command lines terminated by DONE Output Format: one line per command (a balance, formatted to 2 decimals, or INSUFFICIENT FUNDS) Constraints: amounts are non-negative doubles

Examples:

100.0; DEPOSIT 50, WITHDRAW 30, WITHDRAW 200, DONE → 150.00 / 120.00 / INSUFFICIENT FUNDS
0.0; WITHDRAW 10, DEPOSIT 10, WITHDRAW 10, DONE → INSUFFICIENT FUNDS / 10.00 / 0.00
500.0; WITHDRAW 500, DEPOSIT 0, DONE → 0.00 / 0.00

Important Edge Cases: a withdrawal landing exactly on 0 (must succeed, not be rejected); a deposit of 0. This Exercise Tests: a single evolving object driven by a loop-based command interpreter, with a validation rule enforced inside the state-changing method rather than left to the caller.
* */