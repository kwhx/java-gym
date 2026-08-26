/*
* Exercise 3.2 — Default Field Values vs. Uninitialized Locals

Difficulty: Advanced Concepts Tested: automatic default values for instance fields vs. no default for local variables

Problem Statement:

java
class Ticket {
    int number;
    boolean used;
    String holderName;
}
java
Ticket t = new Ticket();
System.out.println(t.number);
System.out.println(t.used);
System.out.println(t.holderName);

Predict each of the three printed lines. Then, separately, reason about:

java
int localCount;
System.out.println(localCount);

Does this compile? Explain the fundamental rule difference that causes the two snippets to behave so differently.

Reasoning Format: three predicted values for the first snippet; a compiles/does-not-compile determination for the second, with explanation Important Edge Cases: holderName's default — is it the "same kind" of default as number's, or a fundamentally different kind (a reference default vs. a primitive default)? This Exercise Tests: that instance fields always receive automatic default values at object creation, while local variables receive none and must be explicitly assigned before their first use.
* */