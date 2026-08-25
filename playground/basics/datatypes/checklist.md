## Checklist : Data Types

- [ ] Declare and correctly initialize all 8 primitive types with valid literals, including required suffixes
- [ ] State the exact `MIN_VALUE`/`MAX_VALUE` range shape for at least `byte`, `int`, and explain the asymmetry
- [ ] Explain why `char` is fundamentally a 16-bit unsigned integer with a display convention
- [ ] Predict the result of integer overflow (silent wraparound) without running the code
- [ ] Explain why `0.1 + 0.2 != 0.3` and write a safe floating-point comparison
- [ ] Distinguish truncation from rounding when narrowing a floating type to an integer type
- [ ] Explain the `Integer` caching trap and why `==` is unsafe for wrapper comparison in general
- [ ] Explain why unboxing a `null` wrapper throws at runtime, and why this can't happen with a plain primitive
- [ ] Trace a chained expression's numeric promotion step by step, not just its final type
- [ ] Given a stated numeric constraint (max value, number of operations), choose a safe type *before* writing the rest of a solution
