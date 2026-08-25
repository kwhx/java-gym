/*
* Difficulty: Intermediate Concepts Tested: else-if ordering, unreachable (dead) branch detection

Problem Statement:

java
int score = /* given */;
/*if (score >= 60) {
        System.out.println("PASS");
} else if (score >= 80) {
        System.out.println("HONORS");
} else {
        System.out.println("FAIL");
}

Trace the output for each given score, then answer: is there any value of score for which HONORS ever prints? Explain why in one sentence.

Input Format: an int score per trace Output Format: predicted printed line + your one-sentence explanation Constraints: none

Examples (trace each): score=85, score=95, score=40 Important Edge Cases: score=60 exactly, score=59 exactly. This Exercise Tests: recognizing that when an earlier else-if condition fully subsumes a later one, the later branch becomes dead code — regardless of how "correct" it looks in isolation.
* */

//predict output