/*
* Exercise 1.4 — A Method With a Parameter

Difficulty: Beginner Concepts Tested: a parameterized instance method that combines a parameter with existing field state

Problem Statement: Extend a counter class with a method increaseBy that takes one int parameter — name it amount, deliberately different from the field count — and adds it to count. Read an initial count and one amount, create the object, assign the initial count, call the method once, then print the result using the same format as Exercise 1.3.

Input Format: int initialCount, int amount Output Format: one line, Count is: <result> Constraints: -1000 <= initialCount, amount <= 1000

Examples:

10, 5 → Count is: 15
10, -3 → Count is: 7
0, 0 → Count is: 0

Important Edge Cases: amount = 0 (count must be unchanged); a negative amount (effectively a subtraction).

This Exercise Tests: a parameterized method reading a parameter and combining it with field state — and specifically, that the parameter and the field are named differently, since (without this) an identically-named parameter would shadow the field instead of updating it.
* */