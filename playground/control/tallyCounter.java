/*
* Difficulty: Advanced Concepts Tested: loop-driven repeated classification with counter accumulation, correct branch ordering to sidestep Java's negative-modulo behavior

Problem Statement: Given N followed by N integers (each -100 to 100). For each number, classify: 0 → ZERO; negative → NEGATIVE; positive → further classify via switch on (number % 3): remainder 0 → POSITIVE_MULT3, remainder 1 → POSITIVE_MOD1, remainder 2 → POSITIVE_MOD2. Print each number's classification, then print final tallies: ZERO:, NEGATIVE:, POSITIVE: (total positives regardless of remainder), POSITIVE_MULT3:.

Input Format: int N, then N ints Output Format: N classification lines, then 4 tally lines Constraints: 1 <= N <= 1000

Examples: N=5, numbers=[0,-3,6,7,-1] →

ZERO
NEGATIVE
POSITIVE_MULT3
POSITIVE_MOD1
NEGATIVE
ZERO:1
NEGATIVE:2
POSITIVE:2
POSITIVE_MULT3:1

Important Edge Cases: negative numbers must never reach the % 3 switch — a negative check must happen first, since Java's % on negative numbers (e.g. -3 % 3 == 0) could silently misclassify a negative number as POSITIVE_MULT3 if the branch ordering were wrong; zero must be caught before both the negative and positive checks. This Exercise Tests: loop-driven classification with simple counter accumulation (no arrays), and correct branch ordering to avoid a subtle, Java-specific negative-modulo bug.
* */