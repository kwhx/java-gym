/*
* Exercise 2.8 — Modeling a Stopwatch

Difficulty: Intermediate Concepts Tested: a no-parameter method mutating state by a fixed internal rule, an independent reset method, tracking a longer mixed sequence

Problem Statement: Design a class representing a stopwatch with a field for elapsed seconds. Provide tick (no parameters, adds exactly 1) and reset (sets elapsed back to 0). Read an initial elapsed value, then five single-character commands ('T' = tick, 'R' = reset), applying each in order and printing elapsed time after every command.

Input Format: int initialElapsed, then five chars (each 'T' or 'R') Output Format: five lines Constraints: 0 <= initialElapsed <= 10000

Examples:

0, T, T, T, R, T → 1 / 2 / 3 / 0 / 1
5, R, T, T, R, T → 0 / 1 / 2 / 0 / 1
10, T, R, T, T, T → 11 / 0 / 1 / 2 / 3

Important Edge Cases: a reset immediately followed by several ticks (must climb back up from 0, not from the original initial value).

This Exercise Tests: a no-parameter method mutating state by a fixed, internal rule (contrasting with 2.6's externally-supplied amounts), across a longer sequence of two interacting state-changing methods.
* */