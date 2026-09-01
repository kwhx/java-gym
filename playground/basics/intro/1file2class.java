/*
* Problem statement: Write a single file containing two classes: Helper (not public) and MainProgram (public),
* where MainProgram.main() calls a static method defined in Helper and prints its return value.
* Determine, before compiling, what the filename must be, then verify.

Input format: None.
* Output format: Whatever Helper's method returns, printed once.
* Constraints: Exactly one public class per file, the non-public class must still be usable from the public one without any import.

Examples:
Helper returns an int, MainProgram prints it directly.
Renaming the file to match the non-public class's name instead → predict the compiler error before trying it.
Making both classes public in the same file → predict the compiler error before trying it.

Edge cases to consider:
* Does a non-public top-level class need to be static to be called from another class in the same file? (Think about what "top-level" already implies.)
* What this tests: Whether you understand that "one public class per file, filename must match it" is a real rule with a specific reason, not an arbitrary convention.
* */