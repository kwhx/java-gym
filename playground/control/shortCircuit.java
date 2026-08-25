//predict output

/*
* Difficulty: Intermediate Concepts Tested: short-circuit evaluation preventing ArithmeticException, order-dependent safety

Problem Statement: Two versions of the same intended check:

java
// Version 1
int a = 0, b = 5;
if (a != 0 && b / a > 1) {
    System.out.println("A");
} else {
    System.out.println("B");
}

// Version 2 (operands swapped)
int a = 0, b = 5;
if (b / a > 1 && a != 0) {
    System.out.println("A");
} else {
    System.out.println("B");
}

For each version: does it print something, or does it throw an exception? If it throws, what type?

Input Format: none (fixed values, reason about both versions) Output Format: for each version — either the printed line, or "throws ArithmeticException" Constraints: none

Examples: trace Version 1; trace Version 2; then trace Version 1 with a=2 instead (should evaluate normally to A or B based on b/a). Important Edge Cases: the only difference between the two versions is operand order, yet one is safe and one crashes. This Exercise Tests: that &&'s short-circuit isn't just a convenience — condition order is a genuine correctness/safety decision.
* */