/*
* Difficulty: Advanced Concepts Tested: fixed-position character validation via charAt without loops, chained AND conditions, char range comparisons

Problem Statement: Given a String plate guaranteed to be exactly 7 characters. Valid format (synthetic, for this exercise): positions 0–1 must be uppercase letters, positions 2–3 must be digits, positions 4–6 must be uppercase letters. Check each position individually using charAt and range comparisons ('A' <= c && c <= 'Z', etc.) — no loops needed since the length is fixed. Print VALID FORMAT or INVALID FORMAT.

Input Format: String plate (exactly 7 chars) Output Format: one line Constraints: plate.length() == 7 guaranteed

Examples:

"AB12CDE" → VALID FORMAT
"A112CDE" → INVALID FORMAT (position 1 is a digit, expected a letter)
"AB1XCDE" → INVALID FORMAT (position 3 is a letter, expected a digit)

Important Edge Cases: boundary chars '0'/'9' for the digit ranges, 'A'/'Z' for the letter ranges; lowercase letters anywhere must count as INVALID FORMAT since the range check 'A'-'Z' doesn't include lowercase. This Exercise Tests: fixed-position validation using charAt and chained && across many positions, plus reused case-sensitivity discipline from earlier exercises.
* */