/*
* Exercise 3.8 — Reassignment Inside a Method Doesn't Escape

Difficulty: Advanced Concepts Tested: the paired contrast to 3.7 — reassigning a parameter has no effect on the caller's original reference

Problem Statement:

java
class Counter {
    int value;
}

void replace(Counter c) {
    c = new Counter();
    c.value = 999;
}
java
Counter counter = new Counter();
counter.value = 5;
replace(counter);
System.out.println(counter.value);

Predict the printed value, and explain why it differs from what 3.7 might lead you to expect without distinguishing carefully between mutating an object and reassigning a reference.

Reasoning Format: predicted value; explanation naming exactly which line differs functionally from 3.7's bump Important Edge Cases: the only structural difference from 3.7 is that this method reassigns c entirely rather than mutating the object c points to — only one of those is visible outside the method. This Exercise Tests: the second half of the "pass by value" reconciliation — the reference value is copied into the parameter, so reassigning that local copy has zero effect on the caller's own variable.
* */