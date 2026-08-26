/*
* Exercise 5.5 — Ticket Booth Simulator

Difficulty: Advanced Concepts Tested: a single object enforcing a resource constraint internally across an unknown-length sequence of requests

Problem Statement: Design a booth-like class with a field tracking available seats. Read a starting seat count, then booking requests (each a positive int) terminated by DONE. For each, call a method attempting to book that many seats: if enough are available, reduce the count and print BOOKED: <remaining> SEATS REMAINING; otherwise reject without changing state and print REJECTED: ONLY <remaining> SEATS LEFT.

Input Format: int startingSeats, then request lines terminated by DONE Output Format: one line per request Constraints: 0 <= startingSeats <= 10000

Examples:

100; requests 30, 80, 10, DONE → BOOKED: 70 SEATS REMAINING / REJECTED: ONLY 70 SEATS LEFT / BOOKED: 60 SEATS REMAINING
5; requests 5, 1, DONE → BOOKED: 0 SEATS REMAINING / REJECTED: ONLY 0 SEATS LEFT
0; requests 1, DONE → REJECTED: ONLY 0 SEATS LEFT

Important Edge Cases: a request for exactly the remaining seat count (must succeed, leaving 0); a request made when 0 seats remain. This Exercise Tests: a single object enforcing its own constraint internally (validation lives inside the method, not the calling loop), correctly tracking a depleting resource across a variable-length request sequence.
* */