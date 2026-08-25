- [ ] I can predict the result of any expression mixing +,-,*,/,% for both int and floating-point operands, including sign behavior of % on negatives.

- [ ] I can explain, without running code, the difference between int division and floating-point division, and when a cast is needed to get the latter.

- [ ] I can trace compound assignment operators (+=, -=, etc.) including their implicit narrowing cast, and explain why b = b + 5 can fail to compile when b += 5 does not.

- [ ] I can distinguish prefix (++x) from postfix (x++) in any expression, including nested/combined uses like x = x++ + ++x.
- [ ] I can build compound boolean expressions with correct precedence between &&, ||, and comparison operators, using parentheses deliberately rather than by trial and error.
- [ ] I know Java has no chained comparison (a < b < c) and can explain precisely why that expression is a type error.
- [ ] I can explain and demonstrate short-circuit evaluation for && and ||, including cases where side effects (like ++) are skipped entirely.
- [ ] I can explain why &/| are not safe substitutes for &&/|| when operands have side effects.
- [ ] I understand ternary result-type promotion — that the compile-time type of a ternary depends on both branches, not just the one chosen at runtime.
- [ ] I can reason correctly about int overflow (silent wraparound, no exception) and choose long when constraints require it.
- [ ] I can perform basic bit manipulation (&, |, ^, ~, <<, >>, >>>) confidently, including bitmask set/clear/toggle/check patterns.
- [ ] I understand the difference between >> and >>> and when the distinction matters (negative numbers).
- [ ] I can write dense multi-clause boolean logic (eligibility-style conditions) without precedence bugs.
- [ ] I can trace a multi-line block combining several operator categories at once and predict every variable's final value without running it.
- [ ] I no longer need a debugger to verify simple-to-moderate operator expressions — I can trace them by hand and trust the trace.