/*
* Difficulty: Medium
* Tests: floating-point representation limits
* Print the result of 0.1 + 0.2 as a double.
* It will not print 0.3. Explain why in a comment, then write a safe equality check between 0.1 + 0.2 and 0.3
* that accounts for floating-point imprecision (without using any library beyond Math).
* Input: None.
* Output: The raw sum; then true/false from your safe comparison.
* Constraints: A direct == comparison must be shown failing before you present the fix.
* Examples: 1) 0.1 + 0.2 prints something like 0.30000000000000004.
* 2) (0.1 + 0.2) == 0.3 → false.
* 3) Your epsilon-based comparison → true.
* Edge cases: Does the same imprecision issue affect float the same way, worse, or differently, and why?
* What it's testing: That floating point is binary approximation, not "computers being buggy" — and that safe comparison is a real, necessary technique.
* */