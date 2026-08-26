/*
* Exercise 2.4 — Modeling a Temperature Sensor

Difficulty: Intermediate Concepts Tested: a single evolving field (not a history), a method whose output depends entirely on current state at call time

Problem Statement: Design a class representing a sensor with a single current reading in Celsius. Provide a method to update the reading (parameter named differently from the field) and a separate method returning a classification based on the current reading: below 0 → "FREEZING"; 0 to 25 inclusive → "MILD"; above 25 → "HOT". Read an initial reading, then two subsequent updates; print the classification after the initial reading and after each update (three lines total).

Input Format: double initialReading, double update1, double update2 Output Format: three lines Constraints: -100 <= all readings <= 100

Examples:

-5.0, 10.0, 30.0 → FREEZING / MILD / HOT
25.0, 0.0, 25.1 → MILD / MILD / HOT
26.0, -1.0, 12.0 → HOT / FREEZING / MILD

Important Edge Cases: a reading landing exactly on 0 or exactly on 25.

This Exercise Tests: a field representing only the current state (not a history), with a method whose result is entirely a function of that current state at the moment it's called.
* */