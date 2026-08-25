/*
* Problem statement: You compile a .class file on one machine and copy it to another machine. List at least four distinct things that must still be true on the second machine for it to run correctly, and separately, describe one thing WORA does not protect you from even when a compatible JVM is present (think about resources outside the bytecode itself — files, native libraries, environment assumptions).

Input format: None. Output format: A short structured list: "Required for it to run" vs "Not guaranteed by WORA." Constraints: Don't just restate "needs a JVM" once — decompose it (version compatibility, architecture-independence of bytecode itself vs of a native library it might call, etc.).

Examples: N/A — analysis exercise. Edge cases to consider: Does bytecode compiled with a newer JDK always run on an older JVM? Why or why not? What this tests: Whether "write once, run anywhere" is understood as a specific, bounded guarantee, not a marketing slogan.
* */