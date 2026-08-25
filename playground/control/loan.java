/*
* Difficulty: Intermediate Concepts Tested: early-exit priority condition, nested if-else inside an else-if chain

Problem Statement: Read hasDefault (0/1), creditScore (int), monthlyIncome (double).

If hasDefault == 1 → REJECTED - DEFAULT HISTORY (checked first, overrides everything).
Else if creditScore >= 750: income ≥ 30000 → APPROVED - PREMIUM, else → APPROVED - STANDARD.
Else if creditScore >= 650: income ≥ 50000 → APPROVED - STANDARD, else → REJECTED - LOW INCOME.
Else → REJECTED - LOW CREDIT.

Input Format: int hasDefault, int creditScore, double monthlyIncome Output Format: one line Constraints: 300 <= creditScore <= 850, 0 <= monthlyIncome <= 1000000

Examples:

hasDefault=1, creditScore=800, income=100000 → REJECTED - DEFAULT HISTORY
hasDefault=0, creditScore=780, income=25000 → APPROVED - STANDARD
hasDefault=0, creditScore=600, income=60000 → REJECTED - LOW CREDIT

Important Edge Cases: creditScore exactly 750 and 650; income exactly at each threshold; hasDefault=1 with an otherwise-perfect profile.

This Exercise Tests: prioritized early-exit logic and nested branching within an else-if ladder.
* */