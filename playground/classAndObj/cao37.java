/*
* Exercise 4.10 — Full End-to-End Trace

Difficulty: Advanced (synthesis) Concepts Tested: everything from 4.1–4.9 combined — multi-frame calls, aliasing, mutation through a parameter, reassignment, and reachability, in one trace

Problem Statement:

java
class Player {
    String name;
    int health;

    void takeDamage(int amount) {
        health = health - amount;
    }

    void healFrom(Player donor, int amount) {
        donor.health = donor.health - amount;
        health = health + amount;
    }
}
java
Player p1 = new Player();
p1.name = "Aria";
p1.health = 100;

Player p2 = new Player();
p2.name = "Bram";
p2.health = 80;

Player active = p1;
active.takeDamage(20);

active = p2;
active.healFrom(p1, 10);

Player backup = p1;
p1 = null;

System.out.println(p2.health);
System.out.println(backup.health);
System.out.println(p1);

Predict all three printed lines. Then: how many Player objects exist in total? At the very end, is the "Aria" object still reachable — through which variable, if any? Walk through, in order, every point where active referred to a different object than just before, and every point where a health field changed, noting its new value each time.

Reasoning Format: three predicted lines; total object count; final reachability of each named player with the specific variable (if any); an ordered list of every reassignment of active; an ordered list of every health change with its new value Important Edge Cases: p1 = null; happens after backup was already assigned from p1 — confirm explicitly why backup is unaffected by that later reassignment. This Exercise Tests: this level's synthesis — multi-frame tracing, aliasing, mutation-through-parameter (the donor parameter in healFrom), reassignment, and final reachability, all in one realistically-sized trace.
* */