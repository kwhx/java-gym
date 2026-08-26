/*
* Exercise 2.2 — Modeling a Library Book

Difficulty: Intermediate Concepts Tested: a boolean-like state field, a state-changing method, a query method returning a String

Problem Statement: Design a class representing a library book with a title and a way to track whether it's checked out. Provide a method that marks it checked out, a method that marks it returned, and a method that reports the current status as "CHECKED OUT" or "AVAILABLE". Read a title and an initial status (0 = available, 1 = checked out), set up the object, then read three actions (CHECK_OUT or RETURN), applying each via the object's methods and printing the status after each.

Input Format: String title, int initialStatus, then three action Strings Output Format: three lines (status after each action) Constraints: initialStatus ∈ {0,1}

Examples:

"Dune", 0, CHECK_OUT, RETURN, CHECK_OUT → CHECKED OUT / AVAILABLE / CHECKED OUT
"1984", 1, RETURN, RETURN, CHECK_OUT → AVAILABLE / AVAILABLE / CHECKED OUT
"Emma", 0, CHECK_OUT, CHECK_OUT, RETURN → CHECKED OUT / CHECKED OUT / AVAILABLE

Important Edge Cases: RETURN applied to a book already available, or CHECK_OUT applied to one already checked out — the exercise does not require preventing this; just observe what your methods actually do when applied "illogically." That observation is the point.

This Exercise Tests: deciding how a boolean-like field should be modified through methods, and building both state-changing and state-querying instance methods.
* */