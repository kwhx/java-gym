/*
* Difficulty: Advanced Concepts Tested: switch selecting an entire independent ruleset per branch, disciplined parallel boundary management

Problem Statement: Given courseCode (String) and rawScore (int, 0–100). Each course applies a completely different grading curve — switch on courseCode, and within each case apply that course's own full if-else threshold set:

MATH101 (strict): A≥85, B≥70, C≥55, D≥40, F<40
ENG201 (lenient): A≥80, B≥65, C≥50, D≥35, F<35
CS301 (very strict): A≥90, B≥78, C≥65, D≥50, F<50
Anything else → INVALID COURSE

Print GRADE: X.

Input Format: String courseCode, int rawScore Output Format: one line Constraints: 0 <= rawScore <= 100

Examples:

MATH101, score=72 → GRADE: B
ENG201, score=72 → GRADE: A (same raw score, different course → different result)
CS301, score=72 → GRADE: C (same raw score again, yet another result)
PHYS101, score=90 → INVALID COURSE

Important Edge Cases: the fact that the same score (72) legitimately produces three different letter grades depending on course is deliberate — it forces genuinely separate branch logic per course rather than shared/reused thresholds; boundary values within each curve. This Exercise Tests: switch selecting an entire independent sub-ruleset (not a single value) per branch, without accidentally sharing logic between branches.
* */