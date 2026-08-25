/*
* Difficulty: Level 3 Concepts tested: Loop invariant reasoning Problem statement: Consider:

int product = 1;
int i = 1;
while (i <= n) {
    product *= i;
    i++;
}

State the loop invariant: what relationship between product, i, and n is true immediately before every check of the while condition (including the very first check, before any iteration)? Express it precisely (e.g. in terms of a factorial-like relationship between product and i), not just "it computes factorial." Then, using that invariant, answer without tracing line-by-line: if the loop were changed to start at i = 0 instead of i = 1, would the final product for n = 5 change? Why or why not? Input format: None (reasoning exercise); optionally verify your invariant against n = 5 by hand. Output format: Your stated invariant (precise, in terms of product and i), and your answer to the i = 0 question with reasoning. Constraints: N/A Examples: N/A — single reasoning problem, though you should sanity-check your invariant against at least one concrete trace (e.g. n = 5) before finalizing your answer. Important edge cases: The invariant must hold before the first iteration too (product = 1 corresponds to 0! = 1 when i = 1) — an invariant that only works "during" the loop but not at entry isn't a real invariant. What it specifically tests: The ability to reason about a loop's correctness structurally (what's always true) rather than just simulating it line by line — a skill that becomes essential once loop bodies get too complex to trace by brute force.
* */