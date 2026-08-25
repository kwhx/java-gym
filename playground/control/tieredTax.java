/*
* Difficulty: Advanced Concepts Tested: cumulative/segmented calculation across multiple if blocks (distinct from single-branch else-if selection)

Problem Statement: Given annualIncome (double), compute tax using progressive brackets where only the portion of income within each bracket is taxed at that bracket's rate (not the whole income at one rate): 0–10000 @ 0%; 10000–40000 @ 12%; 40000–85000 @ 22%; 85000+ @ 32%. Print TAX OWED: X.XX.

Input Format: double annualIncome Output Format: one line Constraints: 0 <= annualIncome <= 10000000

Examples:

income=5000 → TAX OWED: 0.00
income=25000 → TAX OWED: 1800.00 (10000@0% + 15000@12%)
income=100000 → TAX OWED: 18300.00 (10000@0% + 30000@12% + 45000@22% + 15000@32%)

Important Edge Cases: income exactly at a bracket boundary (e.g., exactly 40000 — no portion should be taxed at the next bracket's rate); income below the first threshold; very high income exercising all four brackets. This Exercise Tests: genuinely cumulative, running-total calculation across multiple if segments — a conceptual jump from "pick one matching branch" to "accumulate across several," and precise boundary math to avoid double-counting or gaps.
* */