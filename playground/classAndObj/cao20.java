/*
* Exercise 3.5 — Same State, Different Objects

Difficulty: Advanced Concepts Tested: object identity vs. equality-by-field-values, == on references

Problem Statement:

java
class Point {
    int x;
    int y;
}
java
Point p1 = new Point();
p1.x = 3;
p1.y = 4;

Point p2 = new Point();
p2.x = 3;
p2.y = 4;

System.out.println(p1 == p2);
System.out.println(p1.x == p2.x);

Predict both printed lines. Explain in one or two sentences why the first result may differ from intuition, given that p1 and p2 have identical field values.

Reasoning Format: two predicted boolean values; explanation Important Edge Cases: none beyond the misconception itself — this exercise exists specifically to correct it. This Exercise Tests: that == on references compares identity (are these the exact same object?), not the contents of the objects — two separate objects with matching fields are still not ==.
* */