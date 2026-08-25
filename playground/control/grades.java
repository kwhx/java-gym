/*
* Difficulty: Intermediate Concepts Tested: traditional switch, grouping multiple case labels via fall-through

Problem Statement: Read a char grade (A,B,C,D,F, uppercase only). Using a traditional switch, group cases so multiple labels share one action: A → EXCELLENT; B and C → SATISFACTORY (grouped); D → NEEDS IMPROVEMENT; F → FAIL; anything else → INVALID GRADE.

Input Format: char grade Output Format: one line Constraints: any char

Examples:

'B' → SATISFACTORY
'F' → FAIL
'Z' → INVALID GRADE

Important Edge Cases: lowercase 'b' → INVALID GRADE (case-sensitive), verifying the grouped B/C cases don't accidentally fall further into D.

This Exercise Tests: fall-through-based grouping of multiple case labels to one shared outcome, with break placed only after the group's final case.
* */