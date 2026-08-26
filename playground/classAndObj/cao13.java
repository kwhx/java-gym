/*
* Exercise 2.6 — Modeling an Inventory Item

Difficulty: Intermediate Concepts Tested: two opposite state-changing methods sharing one field, tracking cumulative state across mixed operations

Problem Statement: Design a class representing a warehouse item with a name and a stock quantity. Provide receiveStock (adds a given amount) and shipStock (subtracts a given amount). Read a name, an initial quantity, then four operations, each an operation type (RECEIVE or SHIP) and an amount. Apply them in order, printing the resulting quantity after each.

Input Format: String name, int initialQuantity, then four pairs of (String opType, int amount) Output Format: four lines (quantity after each operation) Constraints: -100000 <= quantity <= 100000 at any point

Examples:

"Widget", 50, RECEIVE 20, SHIP 10, SHIP 5, RECEIVE 100 → 70 / 60 / 55 / 155
"Gadget", 10, SHIP 15, RECEIVE 5, SHIP 0, SHIP 0 → -5 / 0 / 0 / 0
"Gizmo", 0, RECEIVE 0, RECEIVE 0, RECEIVE 0, RECEIVE 0 → 0 / 0 / 0 / 0

Important Edge Cases: a SHIP larger than current stock (goes negative — no validation required at this level; observe what your method actually does).

This Exercise Tests: two related but opposite state-changing methods sharing the same field, and tracking cumulative state across a sequence of mixed operation types.
* */