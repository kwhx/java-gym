/*
* Difficulty: Level 3 Concepts tested: Incorrect update expression/location Problem statement: Read one integer n. Trace this loop exactly and predict its printed output and total iteration count:

int i = 0;
int count = 0;
while (i < n) {
    if (i % 2 == 0) {
        i++;
    }
    count++;
    System.out.println(i);
}

Explain, in one sentence, what's structurally unusual about where the update happens, and why the loop still terminates (or doesn't) for a general n > 0. Input format: One integer n. Output format: The loop's full printed output (one value per line), then count on a final line. Constraints: 1 ≤ n ≤ 20 Examples:

Input: 3 → the loop prints a value every iteration but only advances i on even values of i, so trace it carefully by hand — this is intentionally tedious to force careful tracing rather than pattern-guessing.
Input: 1 → trace independently.
Input: 4 → trace independently. Important edge cases: Recognizing that i only advances conditionally, so count (which always increments) grows faster than i — meaning the loop still terminates, but takes more iterations than n naively suggests. What it specifically tests: Whether you can trace a loop where the update is conditionally applied inside the body rather than unconditionally in a for header — a realistic bug pattern (developer moved logic into a while and lost the "update always happens" guarantee a for header provides).
* */