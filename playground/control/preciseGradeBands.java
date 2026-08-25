/*
* Difficulty: Advanced Concepts Tested: designing a gap-free, overlap-free else-if chain with exact boundaries

Problem Statement: Write code assigning a letter grade from a numeric score using these exact, non-overlapping bands: A: [90,100], B: [80,90), C: [70,80), D: [60,70), F: [0,60). Every score from 0–100 must map to exactly one grade — no gaps, no overlaps.

Input Format: int score Output Format: one letter Constraints: 0 <= score <= 100

Examples:

90 → A
89 → B
60 → D

Important Edge Cases: every boundary value itself — 100, 90, 89, 80, 79, 70, 69, 60, 59, 0 — each must land in exactly the band described above. This Exercise Tests: precise inclusive/exclusive boundary construction across a full else-if chain — the single most common source of off-by-one bugs in beginner CP submissions.
* */