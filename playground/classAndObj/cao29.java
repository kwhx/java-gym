/*
* Exercise 4.2 — Counting Objects and References

Difficulty: Advanced Concepts Tested: precise bookkeeping of objects and references after a sequence of creations and reassignments

Problem Statement:

java
class Widget {
    int id;
}
java
Widget w1 = new Widget();
w1.id = 1;

Widget w2 = new Widget();
w2.id = 2;

Widget w3 = w1;

Widget w4 = new Widget();
w4.id = 4;

w2 = w4;

By the end: how many Widget objects exist? How many reference variables exist? For each object, list every variable currently referring to it (possibly more than one, possibly none).

Reasoning Format: object count; reference-variable count; a mapping of each object to its current referring variable(s) Important Edge Cases: an object referred to by zero variables by the end — identify it explicitly rather than omitting it. This Exercise Tests: precise tracking of the relationship between references and objects across creations and plain reassignments, isolated from method-call framing (which is added next).
* */