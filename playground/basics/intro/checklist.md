## Mastery Checklist : Intro 

Before moving to Data Types, you should be able to, without looking anything up:

- [ ] Explain the distinct roles of the JDK, JRE, and JVM, and which one you'd need for *only* running someone else's compiled program
- [ ] Trace the full path from a `.java` file to a running program: source → `javac` → bytecode (`.class`) → JVM (interpretation and/or JIT compilation)
- [ ] State the exact requirements for a method to be recognized as a program's entry point, and identify near-miss signatures that compile but don't run
- [ ] Explain what WORA guarantees and name at least one thing it does not guarantee
- [ ] Distinguish a compile-time error from a runtime error and predict, for a new snippet, which one applies
- [ ] Explain why JIT compilation exists as a middle ground between pure interpretation and pure ahead-of-time compilation
- [ ] Explain why an object becoming unreachable does not mean it is immediately collected
- [ ] State the file/class-name/`public` relationship and predict compiler behavior when it's violated
- [ ] Explain how JShell's REPL evaluation differs from a compiled program's `main` method execution