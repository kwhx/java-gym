/*
* Difficulty: Level 2 Concepts tested: Ternary operator, nested ternary (justified here — a genuine multi-branch classification) Problem statement: Read an integer score s (0–100). Using a single nested ternary expression (no if/switch), assign a char grade: A for s ≥ 90, B for 80 ≤ s < 90, C for 70 ≤ s < 80, D for 60 ≤ s < 70, F otherwise. Print the grade. Input format: One integer s. Output format: One character. Constraints: 0 ≤ s ≤ 100 Examples:

Input: 95 → A
Input: 82 → B
Input: 59 → F Important edge cases: Exact boundary values 90, 80, 70, 60 must land in the higher bracket. What it specifically tests: Correct nesting and associativity of the ternary operator when several conditions must be checked in sequence, and correct boundary placement.
* */