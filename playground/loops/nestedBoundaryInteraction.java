/*
* Difficulty: Level 3 Concepts tested: Nested-loop off-by-one interaction Problem statement: Read one integer n. Predict the total number of times the innermost System.out.println executes (not just the outer loop's count) for:

for (int i = 1; i <= n; i++) {
    for (int j = i; j <= n; j++) {
        System.out.println(i + "," + j);
    }
}

Give your answer as a formula in terms of n (not just a number for one case), then verify it against n = 4. Input format: One integer n. Output format: Your formula (one line, in words or math notation), then the full printed output for n = 4, then the total count for n = 4. Constraints: 1 ≤ n ≤ 1000 Examples:

n = 4 → total count 10 (this is a triangular number: 4+3+2+1)
n = 1 → total count 1
n = 2 → total count 3 Important edge cases: Recognizing the inner loop's starting point depends on the outer variable (j = i, not j = 1), which is what makes this a triangular count rather than n². What it specifically tests: Whether you can reason about total nested-loop iteration count when the inner bound is coupled to the outer variable — critical for later time-complexity analysis (this exact pattern is O(n²) work done in a triangular, not square, iteration shape).
* */