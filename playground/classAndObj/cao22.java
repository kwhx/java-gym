/*
* Exercise 3.7 — Mutation Through a Parameter

Difficulty: Advanced Concepts Tested: mutation performed inside a method through a reference parameter, visible to the caller after return

Problem Statement:

java
class Counter {
    int value;
}

void bump(Counter c) {
    c.value = c.value + 1;
}
java
Counter counter = new Counter();
counter.value = 5;
bump(counter);
bump(counter);
System.out.println(counter.value);

Predict the final printed value. Explain in one sentence why changes made inside bump are visible in main after each call returns, given that Java passes arguments by value.

Reasoning Format: predicted final value; explanation Important Edge Cases: be precise about what is copied by value here — the reference itself, not the object — which is exactly why the object it points to can still be mutated through that copy. This Exercise Tests: reconciling "Java passes by value" with the observed mutation, correctly.
* */