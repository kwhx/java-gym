/*
* Exercise 5.2 — Two-Player Score Tracker

Difficulty: Advanced Concepts Tested: two independent objects of the same class, routing external input to the correct one, confirming state never leaks between them

Problem Statement: Design a class with a name and a score. Create exactly two objects representing two named players (read both names first). Read a sequence of scoring commands (a name and points), terminated by DONE; route each to the correct object by comparing Strings, call a method adding the points, and print both players' current scores after each command.

Input Format: two names, then (name, points) lines terminated by DONE Output Format: two lines after each command, in a fixed player order Constraints: the name in each command matches one of the two players

Examples:

"Amy", "Ben"; Amy 10, Ben 5, Amy 3, DONE → Amy:10 Ben:0 / Amy:10 Ben:5 / Amy:13 Ben:5
"Cid", "Dee"; Dee 7, Dee 7, DONE → Cid:0 Dee:7 / Cid:0 Dee:14
"Eli", "Fay"; Eli 0, Fay 0, DONE → Eli:0 Fay:0 / Eli:0 Fay:0

Important Edge Cases: a points value of 0; confirming scoring one player never affects the other's score. This Exercise Tests: managing two fully independent objects of the same class simultaneously, correctly routing input to the right one by comparing identifying data.
* */