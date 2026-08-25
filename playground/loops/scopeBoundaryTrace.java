/*
* Difficulty: Level 1 Concepts tested: Loop-variable scope Problem statement: Consider:

for (int i = 0; i < 5; i++) {
    int doubled = i * 2;
}
System.out.println(i);       // line X
System.out.println(doubled); // line Y

Predict: does line X compile? Does line Y compile? Explain why, in terms of where i and doubled are declared and what their scope is. Then, separately, write (in words, not code) what change would be needed to print the loop's final i value after the loop ends. Input format: None (reasoning exercise). Output format: Your compile-status prediction for lines X and Y, with a one-sentence reason each, plus your fix description. Constraints: N/A Examples: N/A — single fixed reasoning problem. Important edge cases: Recognizing that both lines fail for the same underlying reason (variables declared inside a for's parentheses or body don't exist outside its braces), not two different reasons. What it specifically tests: Solid understanding of block scope as it applies specifically to for-loop-declared variables, which is a frequent early-Java compile error.
* */