/*
* Exercise 3.3 — Two References, One Object

Difficulty: Advanced Concepts Tested: aliasing — mutation visible through any reference to a shared object

Problem Statement:

java
class Box {
    int contents;
}
java
Box a = new Box();
a.contents = 10;
Box b = a;
b.contents = 99;
System.out.println(a.contents);
System.out.println(b.contents);

Predict both printed lines. Then answer: how many Box objects exist in total? How many reference variables?

Reasoning Format: two predicted values; object count and reference count, each with a one-sentence justification Important Edge Cases: Box b = a; does not create a new object, even though it visually resembles Box b = new Box();. This Exercise Tests: distinguishing reference assignment from object creation, and predicting that a mutation through either reference is visible through both, since they refer to the same object.
* */