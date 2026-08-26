/*
* Exercise 3.11 — Reachability After Reassignment

Difficulty: Advanced Concepts Tested: object reachability and GC eligibility, without claiming guaranteed immediate reclamation

Problem Statement:

java
class Node {
    int id;
}
java
Node n1 = new Node();
n1.id = 1;

Node n2 = new Node();
n2.id = 2;

Node temp = n1;
n1 = n2;
n2 = temp;
n1 = null;

How many Node objects were created in total? For each, is it still reachable through some variable, or has it become unreachable? If any became unreachable, at exactly which line did that happen? Is that object guaranteed to be collected immediately — why or why not?

Reasoning Format: object count; a reachability determination per object with the specific line where any change occurred; a prose explanation of eligibility vs. guaranteed timing Important Edge Cases: the swap performed via temp — track carefully which id ends up on which surviving variable before reasoning about the final n1 = null;. This Exercise Tests: reference-chain tracing precise enough to identify the exact moment an object loses its last reachable reference, and appropriately careful language about GC eligibility versus actual (unspecified) reclamation timing.
* */