/*
* Exercise 4.8 — One Method's Result Feeding Another

Difficulty: Advanced Concepts Tested: evaluation order and frame lifecycle when one call's return value feeds directly into another call as an argument

Problem Statement:

java
class Meter {
    int readingCm;

    int toInches() {
        int inches = readingCm / 3;
        return inches;
    }
}

int classify(int inches) {
    if (inches > 100) {
        return 1;
    }
    return 0;
}
java
Meter m = new Meter();
m.readingCm = 330;
int result = classify(m.toInches());
System.out.println(result);

Trace the value returned by toInches(), the value passed into classify, and the final printed value. Then describe, in calling order, every stack frame that exists at any point during this snippet's execution — even ones already gone by the end.

Reasoning Format: three intermediate/final values; an ordered list of every frame that existed, noting which are gone by the time println runs Important Edge Cases: toInches()'s frame must be entirely gone — its inches local no longer exists anywhere — before classify's frame is even created, even though the call to classify visually "wraps around" the call to toInches(). This Exercise Tests: that frames are created and destroyed in a strict sequence even when the code's visual nesting might suggest overlap.
* */