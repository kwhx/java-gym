/*
* Exercise 5.6 — Countdown Session Simulator

Difficulty: Advanced Concepts Tested: an object whose behavior depends on the interaction between two of its own fields — the most self-contained mini state machine in the curriculum

Problem Statement: Design a timer-like class with a field for remaining seconds and a field tracking whether it's currently running (default paused when created). Provide a no-parameter method tick that, only if currently running and remaining seconds is above 0, decreases remaining seconds by 1; and methods start and pause setting the running state. Read a starting number of seconds, then commands terminated by DONE: 'S' (start), 'P' (pause), 'T' (tick). Apply each in order, printing remaining seconds and running state after every single command, in the format <seconds> - RUNNING or <seconds> - PAUSED.

Input Format: int startingSeconds, then chars ('S', 'P', or 'T') terminated by DONE Output Format: one line per command Constraints: startingSeconds >= 0

Examples:

10; T, S, T, T, P, T, DONE → 10 - PAUSED / 10 - RUNNING / 9 - RUNNING / 8 - RUNNING / 8 - PAUSED / 8 - PAUSED
2; S, T, T, T, DONE → 2 - RUNNING / 1 - RUNNING / 0 - RUNNING / 0 - RUNNING
5; S, P, S, T, DONE → 5 - RUNNING / 5 - PAUSED / 5 - RUNNING / 4 - RUNNING

Important Edge Cases: a 'T' issued before any 'S' (timer starts paused by default — must have no effect); the timer reaching 0 followed by further 'T' commands (must stay at 0, never go negative); multiple consecutive 'S' or 'P' commands (harmless, no unexpected toggling). This Exercise Tests: an object whose behavior depends on the interaction between two of its own fields (running state gating whether the other can change) — built entirely from instance fields and instance methods.
* */