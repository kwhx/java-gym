/*
* Exercise 1.2 — Multiple Independent Objects

Difficulty: Beginner Concepts Tested: object independence, new invoked multiple times

Problem Statement: Define a class with a single int field representing a count. Create three separate objects, assign each a different initial count directly, then print all three to demonstrate they're stored independently.

Input Format: three ints c1, c2, c3 Output Format: three lines: Counter 1: <c1>, Counter 2: <c2>, Counter 3: <c3> Constraints: -1000 <= c1,c2,c3 <= 1000

Examples:

5, 10, 15 → Counter 1: 5 / Counter 2: 10 / Counter 3: 15
0, 0, 0 → Counter 1: 0 / Counter 2: 0 / Counter 3: 0
7, 7, 3 → Counter 1: 7 / Counter 2: 7 / Counter 3: 3

Important Edge Cases: two of the three objects given the same value — proving independence isn't just about differing values, it's about separate storage regardless of what's stored in it.

This Exercise Tests: that assigning a field on one object never touches another object's field, even for two instances of the exact same class.
* */