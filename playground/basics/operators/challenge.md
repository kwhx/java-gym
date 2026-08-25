**The Ledger Reconciler**

A financial ledger stores a running balance as an `int` (cents, not dollars, no floating-point for money). You are given: a starting balance `start` (int, cents), a sequence encoded as a **single packed integer** `ops` where: bits 0–1 encode an operation type (`00`=deposit, `01`=withdrawal, `10`=fee, `11`=bonus), and the remaining bits (shifted appropriately) encode the amount in cents. You must:
1. Extract the operation type and amount from `ops` using bitwise operators only.
2. Apply the operation to `start` using the correct arithmetic, where `fee` and `withdrawal` behave identically for this exercise (subtract) but must be tracked separately in a status code, and `bonus` adds an *extra* flat 2% on top of the raw amount (computed with correct integer rounding, no floating point).
3. Detect and report (without allowing) an overflow condition, determine whether applying the operation would make the balance exceed `Integer.MAX_VALUE` or go below `Integer.MIN_VALUE + 1`, and if so, print `OVERFLOW` instead of applying it.
4. If the operation is a `withdrawal` or `fee` that would take the balance negative, apply it anyway (negative balances are valid, this is a ledger, not a wallet) but produce a **separate boolean flag** `wentNegative` using a single expression, not an `if`.
5. Print, on separate lines: the operation type name, the extracted amount, the resulting balance (or `OVERFLOW`), and `wentNegative`.

You decide the exact bit layout for packing `ops` (state it clearly), as long as it consistently supports operation type (2 bits) + amount (remaining bits, non-negative). You must use bitwise extraction, reading the amount via arithmetic tricks that don't use `&`/`>>`/`<<` defeats the point of this challenge.

**Constraints:** `-2^31 ≤ start ≤ 2^31 - 1`, amounts fit in whatever bit-width you allot after the 2-bit type field, all reasoning in `int` (using `long` only internally if genuinely needed to detect overflow safely, then reporting the `int`-domain result).