/*
* Difficulty: Level 2 Concepts tested: Sentinel-controlled loop, Scanner input repetition Problem statement: Read integers one at a time from input, accumulating their sum, until you read the sentinel value -1 (which is not itself included in the sum). Print the final sum. There is no fixed count given in advance — you don't know how many numbers precede the sentinel. Input format: A sequence of integers, one conceptually "at a time" (space- or newline-separated via Scanner), terminated by -1. Output format: One integer (the sum). Constraints: Each value except the sentinel is in [-1000, 1000] excluding -1 itself appearing as data; total values before sentinel ≤ 10^4. Examples:

Input: 3 5 2 -1 → 10
Input: -1 → 0
Input: -5 -5 -1 → -10 Important edge cases: Sentinel appearing immediately (empty sequence, sum 0); negative data values that aren't the sentinel (-5 is valid data, only -1 terminates). What it specifically tests: Correct sentinel-loop structure (read-then-check, typically while (true) with an internal break, or a do-while reading first) and not accidentally including the sentinel value in the accumulated result.
* */