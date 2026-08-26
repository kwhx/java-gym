/*
* Exercise 5.3 — Simple Battle Simulator

Difficulty: Advanced Concepts Tested: two interacting objects where a method call directly mutates the other object's state, a loop terminating on evolving object state

Problem Statement: Design a class with a name and health. Create two objects, reading each name and starting health, and a fixed damage-per-hit value. Simulate rounds in a loop: the first fighter deals damage to the second (via a method taking the opponent object as a parameter and reducing its health); then — only if the second fighter's health is still above 0 — the second deals the same damage back to the first. Print both fighters' health after each round. Stop as soon as either fighter's health drops to 0 or below, and print the winner's name.

Input Format: two (name, startingHealth) pairs, then a damage value Output Format: two lines per round, then a final Winner: <name> line Constraints: startingHealth > 0, damage > 0

Examples:

Rex,30, Zed,30, damage 10 → round1: Rex:20 Zed:20; round2: Rex:10 Zed:10; round3: Rex:10 Zed:0; Winner: Rex
Ann,15, Bo,15, damage 20 → round1: Ann:15 Bo:-5; Winner: Ann
Cid,50, Dee,40, damage 15 → round1: Cid:35 Dee:25; round2: Cid:20 Dee:10; round3: Cid:20 Dee:-5; Winner: Cid

Important Edge Cases: the second fighter reaching exactly 0 from the first's attack — their own counterattack must correctly not happen that round. Also, as a reasoning question (not something to implement): given that the second fighter only counterattacks while still above 0, can this simulation, as specified, ever end in a tie where both fighters are at or below 0 after the same round? Work through why or why not. This Exercise Tests: two objects genuinely interacting through a method that takes another object as a parameter and mutates its state, a loop terminating on evolving object state rather than a fixed count, and precise ordering of a conditional action within each iteration.
* */