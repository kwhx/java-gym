//menu handler

/*
* Difficulty: Intermediate Concepts Tested: missing-break fall-through bug identification

Problem Statement: This code is intended to print exactly one action per menu choice:

java
int choice = /* given */;
/*switch (choice) {
        case 1:
        System.out.println("VIEW PROFILE");
        break;
                case 2:
                System.out.println("EDIT PROFILE");
    case 3:
            System.out.println("DELETE PROFILE");
        break;
                }

        For choice = 1, choice = 2, and choice = 3: predict the actual printed output. Does choice = 2 match the "exactly one action" intent? If not, state precisely what minimal one-line change would fix it — don't rewrite the whole switch.

Input Format: int choice per trace Output Format: predicted output per trace + your diagnosis Constraints: none

Examples (trace each): choice=1, choice=2, choice=3 Important Edge Cases: contrasting choice=1 and choice=3 (both correct) against choice=2 (buggy) isolates exactly where the problem is. This Exercise Tests: fall-through bug identification and minimal-fix judgment — not rewriting more than necessary.
* */