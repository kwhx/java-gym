/*
* Difficulty: Advanced Concepts Tested: loop termination combined with an internal switch, separating the loop's exit condition from the switch's own control flow

Problem Statement: Read String commands, one per line, until "EXIT" is read (unknown count in advance — use a loop). For each command before EXIT: "ADD" → ITEM ADDED; "REMOVE" → ITEM REMOVED; "LIST" → SHOWING LIST; "HELP" → AVAILABLE COMMANDS: ADD, REMOVE, LIST, HELP, EXIT; anything else → UNKNOWN COMMAND, TYPE HELP. When "EXIT" is read, print GOODBYE and stop — it must not also be processed by the switch's default case.

Input Format: a sequence of String lines, terminated by the line EXIT Output Format: one line per command processed, in order Constraints: commands are case-sensitive

Examples:

[ADD, LIST, XYZ, EXIT] → ITEM ADDED / SHOWING LIST / UNKNOWN COMMAND, TYPE HELP / GOODBYE
[EXIT] → GOODBYE
[HELP, HELP, EXIT] → AVAILABLE COMMANDS... (twice) / GOODBYE

Important Edge Cases: lowercase "exit" must not terminate the loop — it should hit UNKNOWN COMMAND, TYPE HELP instead, since matching is case-sensitive; an empty line as a command. This Exercise Tests: correctly separating a loop's own termination condition from a switch inside the loop body, and reapplying case-sensitivity discipline at integration scale.
* */