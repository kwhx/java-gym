/*
* Exercise 4.7 — Reading a Field Into a Local Snapshot

Difficulty: Advanced Concepts Tested: a local variable holding a copy of a primitive field's value, vs. a local variable that would hold a copy of a reference

Problem Statement:

java
class Account {
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }
}
java
Account acc = new Account();
acc.balance = 100.0;

double snapshot = acc.balance;
acc.deposit(50.0);

System.out.println(snapshot);
System.out.println(acc.balance);

Predict both printed values, and explain why snapshot does or doesn't reflect the deposit.

Reasoning Format: two predicted values; an explanation; a follow-up prose answer (no code) to: if balance were instead a reference to another object, and snapshot had been assigned that reference, would a later mutation of that object be reflected through snapshot? Important Edge Cases: the contrast between the given double case and the hypothetical reference case in your follow-up answer. This Exercise Tests: the difference between reading a primitive value out of a field (a true, independent copy) and reading a reference out of a field (a copy of the reference, still pointing at the same shared object).
* */