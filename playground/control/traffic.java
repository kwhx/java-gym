/*
* Difficulty: Advanced Concepts Tested: String switch for state transitions, priority-ordered override events, state-machine thinking without lookup tables

Problem Statement: Given currentState ("RED", "YELLOW", "GREEN") and event ("TIMER_EXPIRED", "EMERGENCY_OVERRIDE", "MANUAL_RESET", or others). Rules, checked in this order: EMERGENCY_OVERRIDE from any state → RED (checked first, highest priority); MANUAL_RESET from any state → RED; otherwise, if event == "TIMER_EXPIRED": RED→GREEN, GREEN→YELLOW, YELLOW→RED; any other event → INVALID EVENT.

Input Format: String currentState, String event Output Format: one line — the next state, or INVALID EVENT Constraints: currentState guaranteed to be one of the three valid states

Examples:

currentState="GREEN", event="TIMER_EXPIRED" → YELLOW
currentState="YELLOW", event="EMERGENCY_OVERRIDE" → RED
currentState="RED", event="HONK" → INVALID EVENT

Important Edge Cases: EMERGENCY_OVERRIDE while already RED (should still just print RED — idempotent, no special-casing needed); the override events must be checked before the state-based timer logic, not after. This Exercise Tests: combining String switch for a transition table with priority-ordered override handling — a genuine state-machine design exercise using only switch/if.
* */