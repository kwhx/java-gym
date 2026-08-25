/*
* Difficulty: Advanced Concepts Tested: bounded loop with early-exit driven by if, precise attempt-counting boundary

Problem Statement: Given a secretNumber (int) and a sequence of guesses (one per line), with a maximum of 5 attempts. Process guesses in a loop: if a guess equals the secret → print CORRECT! SOLVED IN N ATTEMPTS (where N is the attempt count) and stop reading further guesses. If lower → TOO LOW; if higher → TOO HIGH. If 5 attempts are used without success, print OUT OF ATTEMPTS. NUMBER WAS: X and stop — do not process any remaining guesses even if more are given in the input.

Input Format: int secretNumber, then a sequence of int guesses (may contain more than 5) Output Format: one line per guess processed, plus a final result line Constraints: 1 <= secretNumber <= 1000

Examples:

secret=42, guesses=[10,50,42] → TOO LOW / TOO HIGH / CORRECT! SOLVED IN 3 ATTEMPTS
secret=7, guesses=[1,2,3,4,5,6] → TOO LOW ×5, then OUT OF ATTEMPTS. NUMBER WAS: 7 (the 6th guess is never processed at all)
secret=5, guesses=[5] → CORRECT! SOLVED IN 1 ATTEMPTS

Important Edge Cases: solving correctly on the exact 5th (final allowed) attempt must still print CORRECT!, not OUT OF ATTEMPTS; any guesses beyond the 5-attempt limit must never be read/processed, not just ignored after processing. This Exercise Tests: combining a bounded loop with an early-exit condition, and getting the attempt-count boundary exactly right — a very real off-by-one risk.
* */