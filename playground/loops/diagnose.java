/*
* Difficulty: Level 3 Concepts tested: Infinite-loop diagnosis Problem statement: You are given three broken loop snippets. For each, without running it, state (a) whether it's infinite, and (b) precisely why, referencing what's wrong with the condition or update:

// Snippet 1
int i = 0;
while (i < 10) { System.out.println(i); }

// Snippet 2
for (int i = 10; i > 0; i++) { System.out.println(i); }

// Snippet 3
int i = 0;
while (i != 10) { i += 3; }

Input format: None (pure diagnosis). Output format: For each snippet: infinite or finite, plus a one-sentence reason. Constraints: N/A Examples: N/A — fixed diagnostic problem. Important edge cases: Snippet 3 is the subtle one — it's infinite not because of a missing update, but because the step size (3) will skip past the exact target value 10 needed by !=, so the condition never becomes false even though i keeps growing correctly. What it specifically tests: Recognizing three distinct categories of infinite-loop cause: (1) missing update entirely, (2) update moving the variable in the wrong direction relative to the condition, and (3) using != as a termination check when the step size can jump over the exact target — a much subtler trap than the first two.
* */