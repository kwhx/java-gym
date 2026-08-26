/*
* Exercise 3.4 — Reassignment Doesn't Ripple

Difficulty: Advanced Concepts Tested: the contrast between mutating shared state and reassigning a reference

Problem Statement:

java
class Box {
    int contents;
}
java
Box a = new Box();
a.contents = 10;
Box b = a;
b = new Box();
b.contents = 500;
System.out.println(a.contents);
System.out.println(b.contents);

Predict both printed lines, and state how many Box objects exist in total by the end.

Reasoning Format: two predicted values; total object count with justification Important Edge Cases: contrast directly with Exercise 3.3 — the only difference is that b is reassigned to a new object here instead of having its contents mutated. Name exactly what's different between the two snippets in your explanation. This Exercise Tests: the single most important distinction in reference reasoning — reassigning a reference variable only changes what that variable points to, with zero effect on any other reference still pointing at the original object.
* */