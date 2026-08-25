//find the bug

/*
* Difficulty: Advanced Concepts Tested: recognizing contradictory (unsatisfiable) compound conditions

Problem Statement:

java
int score = /* given */;
/*if (score > 90 && score < 90) {
        System.out.println("PERFECT BAND");
} else {
        System.out.println("OTHER");
}

Can PERFECT BAND ever print for any integer score? Explain the contradiction, and state what the programmer most likely intended to write instead (describe it, don't need to write the fixed code).

        Input Format: int score per trace Output Format: predicted output + explanation Constraints: any int

        Examples (trace each): score=90, score=100, score=0 Important Edge Cases: score=90 exactly — neither > nor < is satisfied since both are strict. This Exercise Tests: spotting a compound condition that can never be true for any input, and connecting it back to what a correct range check should look like.
* */