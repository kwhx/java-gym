/*
* Difficulty: Advanced Concepts Tested: legal-but-nonstandard default placement, matched cases skipping default, unmatched values falling through from default

Problem Statement:

java
int x = /* given */;
/*switch (x) {
        case 1:
        System.out.println("ONE");
        break;
default:
        System.out.println("DEFAULT");
    case 2:
            System.out.println("TWO");
        break;
                case 3:
                System.out.println("THREE");
        break;
                }

Note default is placed in the middle, without its own break. Trace the full output for each given x.

Input Format: int x per trace Output Format: predicted printed lines (may be more than one) Constraints: none

Examples (trace each): x=1, x=2, x=99 (no match) Important Edge Cases: x=99 — does it print one line or two? Why does a matched case (like x=1 or x=2) never touch default at all, even though it's textually positioned before them? This Exercise Tests: the fact that default in Java can legally appear anywhere, that matched case labels jump directly to themselves and skip default regardless of its position, and that only unmatched values enter default and then continue falling through linearly from there.
* */