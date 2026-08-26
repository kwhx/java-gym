/*
* Exercise 3.9 — A Reference That Becomes Null

Difficulty: Advanced Concepts Tested: tracing a reference to null, reasoning about access through a null reference without exception-handling mechanics

Problem Statement:

java
class Player {
    String name;
}
java
Player p1 = new Player();
p1.name = "Aria";

Player p2 = p1;
p1 = null;

System.out.println(p2.name);
System.out.println(p1);

Predict both printed lines. Then, purely conceptually (no code): if the next line were System.out.println(p1.name); instead, what would happen when this program runs, and why?

Reasoning Format: two predicted values; a prose answer for the hypothetical third line Important Edge Cases: p1 = null; does not destroy the Player object or affect p2 at all — it only changes what p1 itself refers to. This Exercise Tests: that null means "refers to no object," and that accessing a member through a null reference is fundamentally different from accessing one through a valid reference.
* */