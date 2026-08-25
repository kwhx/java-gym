/*
* Problem statement: Open JShell. Without writing a .java file, do the following in sequence and record what JShell prints after each line:

Type 5 + 3 (no semicolon, no variable, no print statement).
Type int x = 10;
Type x alone.
Type x + 5 alone.
Type System.out.println(x);

Input format: None (interactive). Output format: For each of the 5 inputs, record JShell's response exactly as shown (including any $ variable naming it assigns). Constraints: Must be done in JShell, not a compiled program.

Examples:

5 + 3 → some form of auto-named result printout.
x alone → prints the value — no System.out.println needed.
Compare step 3's behavior to what a plain x; statement would do inside a real .java file's main method (it wouldn't print anything) — write one sentence on why JShell differs.

Edge cases to consider: What does JShell do with an expression that has no side effect, versus a plain Java program? What this tests: Understanding that JShell evaluates and echoes expressions as a REPL — this is not how compiled Java programs behave, and conflating the two causes real confusion later.
* */