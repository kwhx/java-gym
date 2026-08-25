/*
* Difficulty: Level 3 Concepts tested: Off-by-one boundary reasoning Problem statement: Read one integer n. Without running any code, state exactly how many times each of these loops executes its body, in terms of n:

// Loop A
for (int i = 0; i < n; i++) { /* body */ }

// Loop B
//        for (int i = 0; i <= n; i++) { /* body */ }

// Loop C
  //      for (int i = 1; i <= n; i++) { /* body */ }

// Loop D
    //    for (int i = 1; i < n; i++) { /* body */ }

//Then, for n = 5, print the iteration counts of A, B, C, D on separate lines. Input format: One integer n. Output format: Four integers (iteration counts), one per line, for A, B, C, D respectively. Constraints: 0 ≤ n ≤ 1000 Examples:

/*Input: 5 → 5, 6, 5, 4
Input: 0 → 0, 1, 0, 0
Input: 1 → 1, 2, 1, 0 Important edge cases: n = 0 (Loop B still runs once, since 0 <= 0 is true; A, C, D run zero times). What it specifically tests: Precise, formula-level understanding of how the start value and the choice of < vs <= jointly determine iteration count — the foundation for avoiding off-by-one bugs in every future loop you write.
* */