//predict output

/*
* Difficulty: Intermediate Concepts Tested: traditional switch fall-through across multiple cases, absence of default

Problem Statement:

java
int x = /* given */;
/*switch (x) {
        case 1:
        System.out.println("ONE");
    case 2:
            System.out.println("TWO");
    case 3:
            System.out.println("THREE");
        break;
                case 4:
                System.out.println("FOUR");
}

Trace all printed lines, in order, for each given x.

Input Format: int x per trace Output Format: predicted printed lines (may be more than one) Constraints: none

Examples (trace each): x=2, x=1, x=4 Important Edge Cases: x=5 (no case matches, and there's no default — what prints? Nothing.) This Exercise Tests: tracing fall-through across two or more consecutive cases, and recognizing that a switch with no default simply does nothing on no match — it doesn't error.
* */