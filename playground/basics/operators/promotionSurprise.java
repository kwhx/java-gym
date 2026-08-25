/*
* Difficulty: Level 3 Concepts tested: Ternary result-type promotion Problem statement: Read one boolean-like integer flag f (0 or 1) and consider:

int a = 5;
double b = 2.5;
var result = (f == 1) ? a : b;

Predict the compile-time type of result (not just its runtime value) — is it int, double, or something else? Explain why, referencing how Java determines a ternary expression's result type when the two branches have different numeric types. Then read the actual f value and print result with exactly the type/precision Java would give it. Input format: One integer f (0 or 1). Output format: Your type explanation (one sentence) and the printed value of result. Constraints: f ∈ {0, 1} Examples:

Input: 1 → type is double; printed value 5.0
Input: 0 → type is double; printed value 2.5 Important edge cases: The branch that "looks like" an int (a) still gets promoted to double at compile time because the ternary's static type is computed from both branches together, regardless of which one is actually chosen at runtime. What it specifically tests: Whether you understand that a ternary's result type is fixed at compile time based on both branches' types (numeric promotion rules), not decided dynamically based on which branch executes.
* */