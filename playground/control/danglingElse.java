//predict output

/*Difficulty: Advanced Concepts Tested: the rule that else binds to the nearest unmatched if when braces are omitted, regardless of indentation

Problem Statement:

java
int a = /* given */, b = /* given */;
 /*       if (a > 0)
        if (b > 20)
        System.out.println("X");
    else
            System.out.println("Y");

Note there are no braces. Trace the output for each given pair.

Input Format: int a, int b per trace Output Format: predicted printed line, or "nothing printed" Constraints: none

Examples (trace each): a=5, b=10; a=5, b=25; a=-5, b=10 Important Edge Cases: a=-5, b=10 — indentation visually suggests Y should print (as if else belonged to the outer if), but it doesn't. What actually happens, and why? This Exercise Tests: the rule that in Java, else always binds to the nearest if without a matching else — indentation is not semantic, only braces are.