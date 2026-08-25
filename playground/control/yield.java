//predict output

/*
* Difficulty: Advanced Concepts Tested: switch expressions, comma-grouped case labels, yield in a block-bodied arrow case

Problem Statement:

java
int day = /* given */;
/*String type = switch (day) {
    case 1, 2, 3, 4, 5 -> "WEEKDAY";
    case 6, 7 -> {
        String s = "WEEKEND";
        yield s;
    }
    default -> "INVALID";
};
System.out.println(type);

Trace the output for each given day. Then answer: why is yield required inside the { } block for cases 6/7, but not for the single-expression arrow for cases 1–5?

Input Format: int day per trace Output Format: predicted printed line + your explanation Constraints: none

Examples (trace each): day=6, day=3, day=9 Important Edge Cases: understanding that a switch expression must produce a value from every path, which is why block bodies need an explicit yield. This Exercise Tests: comfort with switch expressions (not just switch statements), comma-grouped labels, and correct use of yield.
* */