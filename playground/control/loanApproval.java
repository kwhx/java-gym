/*
* Difficulty: Advanced Concepts Tested: multi-factor gating with a derived/computed value, OR-combined alternate qualifying paths, single dominant-reason reporting

Problem Statement: Given income (double), creditScore (int), existingDebt (double), employmentYears (int). Compute debtToIncome = existingDebt / income. Approval requires ALL of: creditScore >= 600; debtToIncome < 0.4; employmentYears >= 2 OR income >= 80000 (an alternate qualifying path for high earners with less tenure). Report only the first failing reason, checked in this priority order: credit score, then debt ratio, then the employment/income combo. If all pass → APPROVED.

Input Format: double income, int creditScore, double existingDebt, int employmentYears Output Format: one line: APPROVED or REJECTED: <REASON> Constraints: income > 0

Examples:

income=50000, credit=650, debt=15000, employmentYears=3 → APPROVED (ratio = 0.3)
income=60000, credit=580, debt=5000, employmentYears=10 → REJECTED: LOW CREDIT SCORE (checked first, regardless of everything else being great)
income=50000, credit=700, debt=25000, employmentYears=5 → REJECTED: HIGH DEBT RATIO (ratio = 0.5)

Important Edge Cases: debtToIncome exactly 0.4 (should reject — the passing condition is strictly < 0.4); employmentYears exactly 2 passes via the first alternate path; income exactly 80000 passes via the second alternate path even with employmentYears < 2; a case that fails multiple checks should only report the highest-priority one. This Exercise Tests: combining a computed derived value with multi-factor gating, an OR-combined alternate qualification path, and ordered single-reason reporting.
* */