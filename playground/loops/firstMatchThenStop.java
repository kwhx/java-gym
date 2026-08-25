/*
* Difficulty: Level 2 Concepts tested: break, early termination, post-loop state reasoning Problem statement: Read one integer n and one integer target. Search integers from 1 to n for the first one that is divisible by both target and 7. As soon as it's found, stop searching (break) and print it. If none exists in range, print -1. You must reason about what value your loop-control variable holds after the break versus after a natural loop exit, since you'll use that to decide the "not found" case. Input format: Two integers n target. Output format: One integer (the match, or -1). Constraints: 1 ≤ n ≤ 10^6, 1 ≤ target ≤ 1000 Examples:

Input: 100 3 → 21
Input: 10 5 → 35? — check: 35 > 10, so actually -1 for this input (verify divisibility by both 5 and 7 within 1–10; none exists, so -1).
Input: 50 7 → 49 Important edge cases: target itself already a multiple of 7 (changes the smallest qualifying value); no valid match within [1, n] at all. What it specifically tests: Correctly distinguishing "loop ended via break with a found value" from "loop ended naturally with no match," which requires either a flag or careful use of the loop variable's final state.
* */