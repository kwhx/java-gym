/*
* Exercise 4.9 — Eligibility Is Not a Guarantee

Difficulty: Advanced Concepts Tested: precise, careful reasoning about garbage-collection eligibility vs. actual timing

Problem Statement: Suppose an object has just become unreachable — no variable anywhere in the program refers to it any longer. Answer, in your own words: (a) is it required to be collected at that exact moment? (b) what is the correct term for its status immediately after becoming unreachable, if not "already collected"? (c) why does the Java language specification deliberately avoid mandating a specific garbage-collection algorithm or timing? (d) give one concrete reason a programmer should not write code that depends on collection happening at a predictable moment.

Reasoning Format: a few sentences per question, (a) through (d) Constraints: none — purely conceptual Important Edge Cases: avoid overcorrecting into assuming collection is unpredictable in whether it eventually happens — reachability-based eligibility is a real, definite condition; only the timing is unspecified. This Exercise Tests: appropriately careful language around garbage collection, avoiding both common misconceptions (instant collection on unreachability, or collection being too unpredictable to reason about at all).
* */