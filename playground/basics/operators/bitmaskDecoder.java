/*
* Difficulty: Level 5 Concepts tested: Bitmask set/check/clear/toggle, applied bitwise operators Problem statement: Four permissions are encoded as bits: READ=1, WRITE=2, EXECUTE=4, DELETE=8. Read one integer mask (a combination of these flags OR'd together) and one command string: CHECK:<flag>, SET:<flag>, CLEAR:<flag>, or TOGGLE:<flag>, where <flag> is one of the four names. For CHECK, print true/false. For the others, print the resulting integer mask after applying the operation (using bitwise operators only — no arithmetic add/subtract to simulate them). Input format: One integer mask, then one command string, space-separated. Output format: One line — boolean for CHECK, integer for the others. Constraints: 0 ≤ mask ≤ 15 Examples:

Input: 5 CHECK:WRITE → false (mask 5 = READ+EXECUTE, no WRITE bit)
Input: 5 SET:WRITE → 7
Input: 7 CLEAR:READ → 6
Input: 6 TOGGLE:EXECUTE → 2 Important edge cases: SETting a flag that's already set (mask unchanged); CLEARing a flag that's already clear (mask unchanged); TOGGLE on mask = 0. What it specifically tests: Fluency with the four canonical bitmask operations (| to set, &~ to clear, ^ to toggle, & to check) as a unit, which is a foundational CP/systems pattern.
* */