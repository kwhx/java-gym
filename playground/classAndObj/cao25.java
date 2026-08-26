/*
* Exercise 3.10 — State-Tracing a Call Sequence

Difficulty: Advanced Concepts Tested: disciplined step-by-step state tracking across additive, subtractive, and reset effects on one field

Problem Statement:

java
class Tank {
    int liters;

    void fill(int amount) {
        liters = liters + amount;
    }

    void drain(int amount) {
        liters = liters - amount;
    }

    void emptyCompletely() {
        liters = 0;
    }
}
java
Tank t = new Tank();
t.liters = 20;
t.fill(15);
t.drain(10);
t.emptyCompletely();
t.fill(8);
System.out.println(t.liters);

Predict the value of t.liters after each of the five calls individually, not just the final printed result.

Reasoning Format: five intermediate values in order, plus the final printed value (must match your fifth) Important Edge Cases: make sure emptyCompletely genuinely resets to 0 in your trace rather than being skimmed over. This Exercise Tests: disciplined tracking across a sequence with three different kinds of effects (additive, subtractive, absolute reset) on one field.
* */