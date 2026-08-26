/*
* Exercise 5.4 — Fund Transfer Between Accounts

Difficulty: Advanced Concepts Tested: a single method call mutating two different objects' state in one coordinated operation

Problem Statement: Design an account-like class with a balance field and a method transferTo taking another account object and an amount: subtract the amount from the current object's balance and add it to the other account's balance — but only if the current object's balance is sufficient; otherwise leave both unchanged and print TRANSFER REJECTED instead of the usual output. Create two accounts with starting balances, then read a sequence of transfer amounts (always from the first account to the second), applying each and printing both balances after each successful transfer.

Input Format: two starting balances, then a sequence of transfer amounts Output Format: either two balance lines (2 decimals) or a single TRANSFER REJECTED line, per attempt Constraints: amounts are non-negative doubles

Examples:

1000, 200; transfers 300, 900, 50 → 700.00 / 500.00, then TRANSFER REJECTED, then 650.00 / 550.00
100, 0; transfer 100 → 0.00 / 100.00
50, 50; transfers 0, 50 → 50.00 / 50.00, then 0.00 / 100.00

Important Edge Cases: a transfer amount exactly equal to the current balance (must succeed, leaving the source at exactly 0). This Exercise Tests: a single method call legitimately mutating the state of two different objects at once — the current object and a second object passed in as a parameter — a genuinely multi-object interaction beyond 1.7's simpler single-direction case.
* */