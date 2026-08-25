/*
* Difficulty: Level 1 Concepts tested: while/do-while/for equivalence Problem statement: Read one integer n (n ≥ 1). Predict, without writing code first, how many times a loop body executes and what the final printed sequence is for each of these three loops, all intended to print 1 through n:

// Loop A
int i = 1;
while (i <= n) { System.out.println(i); i++; }

// Loop B
int i = 1;
do { System.out.println(i); i++; } while (i <= n);

// Loop C
for (int i = 1; i <= n; i++) { System.out.println(i); }

Then state: for which value(s) of n (within the given constraints) do Loops A and B produce different output? Explain why. Input format: One integer n. Output format: Your prediction of iteration count for each loop, and your answer (with reasoning) to the "different output" question. Constraints: 0 ≤ n ≤ 100 (note: 0 is included deliberately) Examples:

n = 5 → all three print 1 2 3 4 5; A and B agree.
n = 1 → all three print 1; A and B agree.
n = 0 → A and C print nothing; B prints 1 — this is the divergence case. Important edge cases: n = 0, where the do-while's "runs at least once" guarantee causes it to diverge from while/for. What it specifically tests: Genuine understanding that do-while checks its condition after the body, which matters precisely at boundary values where the condition starts out false.
* */