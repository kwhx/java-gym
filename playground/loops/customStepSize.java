/*
* Difficulty: Level 1 Concepts tested: Step sizes other than 1 Problem statement: Read three integers start, end, step (step > 0, start ≤ end). Print every value from start to end (inclusive if landed on exactly, otherwise stop just before overshooting), incrementing by step each time, one value per line. Input format: Three integers start end step. Output format: One value per line. Constraints: -1000 ≤ start ≤ end ≤ 1000, 1 ≤ step ≤ 100 Examples:

Input: 0 10 3 → 0, 3, 6, 9
Input: 5 5 1 → 5
Input: -10 0 4 → -10, -6, -2 Important edge cases: step that doesn't evenly divide (end - start) — the loop must stop before overshooting end, not print a value past it. What it specifically tests: Correct loop condition when the step size isn't 1, specifically that off-by-one reasoning changes when you're not incrementing by exactly one each time.
* */