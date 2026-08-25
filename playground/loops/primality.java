/*
* Difficulty: Level 4 Concepts tested: Efficient iteration (√N bound), boundary handling for small n Problem statement: Read one integer n. Determine whether it's prime using trial division up to √n only (not up to n), correctly handling the small special cases. Print true/false. Input format: One integer n. Output format: true or false. Constraints: -10 ≤ n ≤ 10^12 (note the negative and small values — this is intentional, not a mistake) Examples:

Input: 17 → true
Input: 1 → false
Input: -7 → false
Input: 999999999989 → true (a large prime — must complete quickly, proving your √n bound is actually being used) Important edge cases: n ≤ 1 (not prime, by definition, and must be handled before the loop even starts, not discovered accidentally by an empty loop); n = 2 (the only even prime — verify your loop doesn't special-case evens incorrectly and exclude it). What it specifically tests: Whether you correctly separate "mathematical definition edge cases" (n ≤ 1) from "loop mechanics," and whether the √n efficient-iteration technique from Exercise LP19 is now a repeatable habit rather than a one-off.
* */