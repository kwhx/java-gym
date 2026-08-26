/*
* Exercise 4.1 — Frames at a Single Moment

Difficulty: Advanced Concepts Tested: identifying active stack frames and their contents at one paused instant

Problem Statement:

java
class Helper {
    int base;

    int compute(int extra) {
        int result = base + extra;
        return result;
    }
}
java
Helper h = new Helper();
h.base = 10;
int x = h.compute(5);
System.out.println(x);

Imagine execution is paused exactly at the moment the line int result = base + extra; is about to run. At this exact instant: which method invocations are currently active? For each active frame, list every local variable/parameter it conceptually holds and its current value. Separately, describe the heap object that exists at this moment and its field values.

Reasoning Format: an ordered list of active frames, each with locals/parameters and values; a separate heap description Important Edge Cases: result does not exist yet in compute's frame at the exact instant before its own declaration line finishes — be precise about what "about to run" means for a variable declared on that very line. This Exercise Tests: building an accurate snapshot of the call stack and heap at one instant, not just before-and-after.
* */