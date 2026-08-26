/*
* Exercise 4.3 — What a Parameter Really Carries Into a Frame

Difficulty: Advanced Concepts Tested: a reference parameter's frame content vs. the heap object it points to, and what persists after return

Problem Statement:

java
class Ledger {
    double total;

    void record(double amount) {
        total = total + amount;
    }
}

void applyTwice(Ledger l, double amount) {
    l.record(amount);
    l.record(amount);
}
java
Ledger ledger = new Ledger();
ledger.total = 0.0;
applyTwice(ledger, 50.0);
System.out.println(ledger.total);

Predict the printed value. Then: while applyTwice is in the middle of its second call to l.record(amount), how many stack frames are active in total, and what does each frame's relevant reference/parameter conceptually hold? After applyTwice returns entirely, what happens to its frame, and does anything about ledger's state get lost along with it?

Reasoning Format: predicted value; a frame-by-frame description at the specified moment; an explanation of what survives vs. disappears after applyTwice returns Important Edge Cases: record's frame from the first call has already been destroyed by the time the second call begins — the two calls do not share or reuse a frame. This Exercise Tests: three-frame-deep call-stack reasoning (main → applyTwice → record), and that local/parameter data disappears with its frame on return while mutated object state persists on the heap regardless.
* */