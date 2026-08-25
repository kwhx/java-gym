/*
* Difficulty: Beginner Concepts Tested: else-if chain, ordering, inclusive boundaries

Problem Statement: Read a package weight in kg (double). Classify it: weight ≤ 1 → TIER A; ≤ 5 → TIER B; ≤ 20 → TIER C; otherwise → TIER D.

Input Format: double weight Output Format: one line (tier label) Constraints: 0.01 <= weight <= 1000.0

Examples:

1.0 → TIER A
5.0 → TIER B
20.0 → TIER C
20.01 → TIER D

Important Edge Cases: exactly 1.0, 5.0, 20.0 (all inclusive to the lower tier), a value just above each boundary.

This Exercise Tests: correct else-if ordering and that boundaries are inclusive on the tier being checked, not the next one.
* */