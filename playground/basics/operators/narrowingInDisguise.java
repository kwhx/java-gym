/*
* Difficulty: Level 3 Concepts tested: Compound assignment implicit narrowing cast Problem statement: Consider:

byte b = 100;
b += 50;          // line A

versus

byte b = 100;
b = b + 50;        // line B

Predict, in writing: does line A compile? Does line B compile? If either compiles, what value does b hold afterward, accounting for byte overflow (byte range is -128 to 127)? Then read one integer start (a valid starting byte value) and one integer add (an int to add), and simulate line A's behavior (compound assignment with implicit narrowing) to print the resulting byte value, wrapping correctly if it overflows the byte range. Input format: Two integers start and add, space-separated. Output format: One line: your compile-status answer for both lines (e.g. A: compiles, B: does not compile), then the resulting byte value after simulating line A's operation with the given start/add. Constraints: -128 ≤ start ≤ 127, -300 ≤ add ≤ 300 Examples:

Input: 100 50 → resulting byte value -106 (100+50=150, which wraps within byte range)
Input: -128 -1 → resulting byte value 127
Input: 0 0 → resulting byte value 0 Important edge cases: The overflow-wrap direction for byte (same two's-complement idea as int, just an 8-bit range). What it specifically tests: Whether you know that compound assignment operators (+=, etc.) contain an implicit cast back to the variable's original type that plain variable = variable + value does not get automatically — a genuinely common "why won't this compile" trap.
* */