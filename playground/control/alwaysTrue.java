//find the bug

/*
* Difficulty: Advanced Concepts Tested: recognizing tautological compound conditions, dead else branches

Problem Statement:

java
int n = /* given */;
/*if (n > 0 || n <= 0) {
        System.out.println("A");
} else {
        System.out.println("B");
}

For which values of n does B ever print? Justify your answer using the logical relationship between the two operands, not just by trying examples.

Input Format: int n per trace Output Format: predicted output + logical justification Constraints: any int

Examples (trace each): n=5, n=-5, n=0 Important Edge Cases: n=0 specifically — make sure your reasoning correctly places it in one side of the OR. This Exercise Tests: recognizing when a compound condition is tautological (always true for every possible input) and therefore makes the else branch permanently dead code.
* */