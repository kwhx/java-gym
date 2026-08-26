/*
* Exercise 3.12 — The Computed Value That Never Gets Stored

Difficulty: Advanced Concepts Tested: a very common real bug — computing an updated value correctly but forgetting to write it back into the field

Problem Statement:

java
class Score {
    int points;

    void addBonus(int bonus) {
        int newTotal = points + bonus;
    }
}
java
Score s = new Score();
s.points = 50;
s.addBonus(25);
System.out.println(s.points);

Predict the printed value. It's likely not what a casual reading of addBonus suggests — explain precisely why, naming the specific missing step.

Reasoning Format: predicted value; one-sentence explanation naming the missing step Important Edge Cases: newTotal is computed correctly — the bug isn't in the arithmetic, which is exactly what makes it easy to miss on a quick read. This Exercise Tests: distinguishing a local variable holding a computed result from the instance field that actually represents persistent object state — computing a value is not the same as storing it.
* */