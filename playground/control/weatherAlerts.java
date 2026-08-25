/*
* Difficulty: Beginner Concepts Tested: single if, independent (non-mutually-exclusive) conditions, boundary inclusivity, "no output" as a valid outcome

Problem Statement: Read a temperature in Celsius (double). Print FREEZING WARNING if the temperature is less than or equal to 0.0. Separately, print HEAT WARNING if the temperature is greater than or equal to 40.0. These are two independent if statements — not an if-else.

Input Format: A single double temp. Output Format: Zero, one, or (never both, but structurally independent) up to two lines, in the order checked above. Constraints: -100.0 <= temp <= 100.0

Examples:

Input: -5.0 → Output: FREEZING WARNING
Input: 42.3 → Output: HEAT WARNING
Input: 25.0 → Output: (no lines at all)

Important Edge Cases: exactly 0.0 (must trigger), exactly 40.0 (must trigger), a mid-range value that legitimately produces no output.

This Exercise Tests: that you understand if without else can produce no output at all, and that two separate ifs are not the same as if-else.
* */