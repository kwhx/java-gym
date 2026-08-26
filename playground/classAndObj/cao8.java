/*
* Exercise 2.1 — Modeling a Rectangle

Difficulty: Beginner-Intermediate Concepts Tested: choosing what belongs as stored state vs. computed behavior

Problem Statement: Design a class representing a rectangle, with whichever fields you judge necessary, and at least one method returning its area and one returning its perimeter — both computed from the object's own field state, not passed in as parameters. Read a width and height, set up one object, call both methods, and print the results.

Input Format: double width, double height Output Format: two lines: Area: <area> and Perimeter: <perimeter> Constraints: 0 < width, height <= 10000

Examples:

4, 5 → Area: 20.0 / Perimeter: 18.0
3, 3 → Area: 9.0 / Perimeter: 12.0
10.5, 2 → Area: 21.0 / Perimeter: 25.0

Important Edge Cases: width equal to height (a square — no special-casing should be needed with correctly designed fields/methods).

This Exercise Tests: deciding what belongs as instance state (width/height) versus what belongs as computed behavior (area/perimeter) implemented as a method deriving results purely from existing field state.
* */