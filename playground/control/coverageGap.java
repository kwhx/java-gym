//predict output

/*
* Difficulty: Advanced Concepts Tested: distinguishing a coverage gap (uncovered case) from an unreachable (dead) branch

Problem Statement:

java
int age = /* given */;
/*String tier = "UNKNOWN";
if (age <= 12) {
tier = "CHILD";
        } else if (age >= 13 && age <= 19) {
tier = "TEEN";
        }
        System.out.println(tier);

Note: there is no final else. Trace the output for each given age.

Input Format: int age per trace Output Format: predicted printed line Constraints: none

Examples (trace each): age=12, age=19, age=20 Important Edge Cases: age=20 — no branch condition matches it at all, so it falls through to the pre-initialized default. Is this a gap (missing coverage) or unreachable code (dead branch)? Explain the difference. This Exercise Tests: the distinction between a branch that's dead because an earlier condition subsumes it (3.1's bug) and a branch structure that simply never accounts for certain input values (this bug) — both are real CP bugs but require different fixes.
* */