/*
* Exercise 4.5 — Two Active Frames, One Shared Object

Difficulty: Advanced Concepts Tested: nested instance-method calls where the "current object" is implicitly carried into the called method

Problem Statement:

java
class Journal {
    int entryCount;

    void addEntry() {
        entryCount = entryCount + 1;
        checkMilestone();
    }

    void checkMilestone() {
        if (entryCount == 3) {
            System.out.println("Milestone reached");
        }
    }
}
java
Journal j = new Journal();
j.entryCount = 0;
j.addEntry();
j.addEntry();
j.addEntry();

Predict what gets printed, and during which of the three addEntry() calls. At the exact moment checkMilestone() is executing during the third call, how many stack frames are active in total, and which object does each frame's implicit "current object" refer to?

Reasoning Format: predicted output identifying which call triggers it; a frame count and description at the specified moment Important Edge Cases: addEntry calling checkMilestone is one instance method calling another on the same object without passing any reference — this works because both methods belong to the class and act on that same object's own state. This Exercise Tests: multi-frame reasoning where every frame in the chain operates on the exact same single heap object.
* */