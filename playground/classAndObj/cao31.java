/*
* Exercise 4.4 — What Survives a Return

Difficulty: Advanced Concepts Tested: cleanly separating local/parameter lifetime from field lifetime, even when their values happen to coincide

Problem Statement:

java
class Cache {
    int storedValue;

    int computeAndStore(int input) {
        int doubled = input * 2;
        storedValue = doubled;
        return doubled;
    }
}
java
Cache cache = new Cache();
int returned = cache.computeAndStore(21);

After this snippet finishes: does doubled still exist anywhere? Does input still exist anywhere? What is cache.storedValue? What is returned, and where did its value come from — the field, or something else?

Reasoning Format: a direct answer with one-sentence justification for each of the four questions Important Edge Cases: returned and cache.storedValue end up holding the same value here — your explanation should make clear they are still two entirely independent pieces of storage that merely happen to match, not the same variable. This Exercise Tests: separating "locals and parameters vanish when their frame is popped" from "field values persist independently on the heap," in a case specifically designed to make them look related.
* */