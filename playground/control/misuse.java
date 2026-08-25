/*
* Difficulty: Advanced Concepts Tested: articulating switch-vs-if selection criteria, hands-on refactoring

Problem Statement: You're shown (conceptually) code that checks a single int variable against six exact, discrete integer values (1 through 6) using a long chain of if (x == 1) ... else if (x == 2) ... else if (x == 3) ... and so on, with no ranges or compound conditions anywhere. (1) State, in your own words, why this is a poor construct choice given the data, and what specifically about the values (discreteness, count, exactness) makes switch the better fit. (2) Then actually rewrite it as a switch yourself. (3) Identify one hypothetical future requirement that would justify keeping if-else instead (e.g., a case that later needs a range or compound condition).

Input Format: conceptual — no fixed input/output pair; produce working switch code as your answer Output Format: your written judgment (1–2 sentences) + your rewritten switch code Constraints: n/a

Examples: n/a (judgment exercise) — self-verify your rewrite against a few of the six known values. Important Edge Cases: consider what happens if a 7th discrete value is added later — which structure adapts more cleanly? This Exercise Tests: the actual decision criteria for choosing switch over if-else (discrete/exact values, several branches, no ranges), not just recognizing the syntax exists.
* */