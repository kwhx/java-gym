/*
* Difficulty: Beginner Concepts Tested: arrow-switch syntax, default, char comparison case-sensitivity

Problem Statement: Read a single char signal. Using arrow switch syntax: 'R' → STOP, 'Y' → SLOW DOWN, 'G' → GO, anything else → UNKNOWN SIGNAL.

Input Format: char signal Output Format: one line Constraints: any printable char

Examples:

'R' → STOP
'G' → GO
'X' → UNKNOWN SIGNAL

Important Edge Cases: lowercase 'r' (must NOT match 'R' — switch on char is case-sensitive) → UNKNOWN SIGNAL.

This Exercise Tests: arrow-switch fluency and that no break is needed to prevent fall-through in arrow form.
* */