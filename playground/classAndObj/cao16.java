/*
* Exercise 3.1 — The Shadowed Field

Difficulty: Advanced Concepts Tested: parameter shadowing an instance field, and why this matters specifically because this is not part of this curriculum yet

Problem Statement:

java
class Account {
    double balance;

    void setBalance(double balance) {
        balance = balance;
    }
}
java
Account acc = new Account();
acc.balance = 100.0;
acc.setBalance(250.0);
System.out.println(acc.balance);

Predict the printed value, and explain in one sentence why the field never actually changes. Then reason about two variants: (a) if the parameter were renamed to newBalance instead, would the field update correctly with a straightforward assignment inside the method? (b) In a version of Java where you could use this to disambiguate — without writing any code — describe in words what that keyword would resolve.

Reasoning Format: predicted printed value; one-sentence explanation; a short answer to (a) and (b) Constraints: none Important Edge Cases: this code compiles and runs without any error — it fails silently, which is exactly why the bug is dangerous. This Exercise Tests: that an unqualified name inside a method resolves to the nearest enclosing declaration — the parameter, not the field, when the two share a name — and why this curriculum's exercises deliberately keep field and parameter names distinct.
* */