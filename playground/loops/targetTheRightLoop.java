/*
* Difficulty: Level 3 Concepts tested: Labeled break/continue Problem statement: Read one integer n. Trace exactly what this prints:

outer:
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        if (j == 3) {
            continue outer;
        }
        if (i == 4) {
            break outer;
        }
        System.out.println(i + "," + j);
    }
}

Give the full printed output for n = 5. Input format: One integer n. Output format: The full traced output, one i,j pair per line. Constraints: n = 5 for this exercise specifically (fixed, to force exact tracing rather than pattern-matching a formula) Examples: There is one canonical correct trace for n = 5 — work through it row by row: for each i from 1 to 3, j goes 1, 2 and then continue outer fires at j == 3 (skipping the rest of that inner loop and moving to the next i); at i == 4, the very first iteration (j == 1) hits break outer before printing anything for that i, ending the entire nested structure — so i = 5 never runs at all. Important edge cases: continue outer skips only the current outer iteration's remaining inner work, but break outer exits both loops entirely — confusing these two is the single most common labeled-loop bug. What it specifically tests: Precise understanding that a label targets a specific loop, and that continue <label> vs. break <label> have fundamentally different scopes of effect (skip-and-continue-outer-loop vs. exit-everything).
* */