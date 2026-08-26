/*
* Exercise 2.5 — Modeling a Playlist Track

Difficulty: Intermediate Concepts Tested: a method combining field state with a parameter to compute a result, without mutating the field

Problem Statement: Design a class representing a track with a title and duration in seconds. Provide a method remainingAfter taking an elapsed-seconds parameter and returning the remaining seconds (duration minus elapsed), without modifying the duration field. Read a title, a duration, and two elapsed values; call remainingAfter for each and print both results, then print the duration once more to confirm it never changed.

Input Format: String title, int durationSeconds, int elapsed1, int elapsed2 Output Format: three lines: Remaining after <elapsed1>s: <result>, Remaining after <elapsed2>s: <result>, Duration: <duration> Constraints: 0 <= durationSeconds <= 10000

Examples:

"Song A", 200, 50, 150 → Remaining after 50s: 150 / Remaining after 150s: 50 / Duration: 200
"Track B", 180, 0, 180 → Remaining after 0s: 180 / Remaining after 180s: 0 / Duration: 180
"Track C", 100, 120, 10 → Remaining after 120s: -20 / Remaining after 10s: 90 / Duration: 100

Important Edge Cases: elapsed greater than duration (a negative result — no validation required); elapsed exactly equal to duration (result 0).

This Exercise Tests: a method computing a result from a combination of field state and a parameter, without mutating the field — reinforcing stored state vs. a purely computed, call-specific result.
* */