```
[ ] I can convert between while, do-while, and for freely, and I know precisely when do-while's "runs at least once" guarantee changes behavior.
[ ] I can compute, by formula (not just simulation), how many times a loop will execute given its start, bound, comparison operator, and step size.
[ ] I can diagnose an infinite loop by category: missing update, update moving the wrong direction, or a step size that skips past a != target.
[ ] I can trace a loop where the update is misplaced or conditional, without assuming it behaves like a standard for loop.
[ ] I can reason about nested-loop total iteration counts, including cases where the inner bound depends on the outer variable (triangular vs. square iteration shapes).
[ ] I can use break and continue correctly, including knowing exactly what state a loop variable holds after a break vs. a natural exit.
[ ] I can use labeled break and labeled continue, and I can state precisely which loop each one targets and how their effects differ.
[ ] I can state a loop invariant for a moderately complex loop — what's true before every condition check, including before the first iteration.
[ ] I can write sentinel-controlled and input-driven loops without off-by-one errors around the sentinel value itself.
[ ] I default to efficient iteration bounds (e.g. √n for divisor/primality checks) rather than brute force, when constraints call for it.
[ ] I can write simulation loops that track evolving state correctly across iterations, including early-exit conditions embedded in the simulation logic.
[ ] I combine loops with bitwise and arithmetic operator reasoning fluently (parity checks, popcount, digit manipulation) rather than treating loops and operators as separate skills.
[ ] I actively watch for overflow in loop accumulators, not just in single expressions.
[ ] I can recognize when a loop is unnecessary and can be replaced by a closed-form expression, and I can state when keeping the loop is still the right call.
[ ] I can trace nested loops with multiple exit conditions, labels, and compound boolean logic without needing to run the code first.
```