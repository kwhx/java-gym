/*
* Exercise 4.6 — A Chain of Reassignments and What's Left Reachable

Difficulty: Advanced Concepts Tested: tracing reachability across several reassignments spread across more than one object, including a pass through null

Problem Statement:

java
class Slot {
    String label;
}
java
Slot s1 = new Slot();
s1.label = "First";

Slot s2 = new Slot();
s2.label = "Second";

Slot s3 = new Slot();
s3.label = "Third";

s1 = s2;
s2 = s3;
s3 = null;
s1 = s3;

By the end: how many Slot objects were created? For each, its label and whether it's still reachable. If any became unreachable, identify the exact line where that happened.

Reasoning Format: object count with labels; a reachability determination per object; the specific line where each unreachable object lost its last reference Important Edge Cases: the final line s1 = s3; — by that point s3 is already null, so reason carefully about what this assignment actually does to s1, rather than assuming it refers back to "Third". This Exercise Tests: careful sequential tracing where reassignments chain across multiple variables and one passes through null partway through.
* */