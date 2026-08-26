/*
* Exercise 3.6 — Wrong Object, Right Method

Difficulty: Advanced Concepts Tested: find-the-bug — incorrect object selection from a reference mix-up

Problem Statement:

java
class Account {
    double balance;

    void withdraw(double amount) {
        balance = balance - amount;
    }
}
java
Account checking = new Account();
checking.balance = 500.0;

Account savings = new Account();
savings.balance = 2000.0;

Account current = checking;
current = savings;
current.withdraw(300.0);

System.out.println(checking.balance);
System.out.println(savings.balance);

This is meant to withdraw from checking. Predict what actually prints for both accounts, and identify precisely which line caused current to end up pointing at the wrong object.

Reasoning Format: two predicted values; a one-sentence identification of the responsible line Important Edge Cases: current = checking; alone would have been correct — it's the second assignment that silently redirects current. This Exercise Tests: tracing a reference variable through multiple reassignments to determine which object it actually points to at the moment a method is called — a very realistic real-world bug category.
* */