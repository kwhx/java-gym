/*
* Difficulty: Intermediate Concepts Tested: switch (discrete selection) combined with if (continuous amount check) — the core if-vs-switch pairing

Examples:

selection=2, amount=2.00 → SODA DISPENSED, CHANGE: 0.50
selection=7, amount=5.00 → INVALID SELECTION
selection=4, amount=1.00 → INSERT MORE MONEY

Important Edge Cases: amount exactly equal to price (must dispense, change 0.00), selection out of 1–6 range.

This Exercise Tests: combining switch (discrete lookup) with if (continuous comparison) in one problem — the central if-vs-switch judgment skill.

* Problem Statement: Read selection (int 1–6) and amountInserted (double).
* Prices by selection: 1=Water $1.00, 2=Soda $1.50, 3=Juice $2.00, 4=Coffee $1.75, 5=Tea $1.25, 6=EnergyDrink $2.50.
* Anything else → INVALID SELECTION (ignore amount entirely).
* If valid: amount ≥ price → <NAME> DISPENSED, CHANGE: X.XX;
* else → INSERT MORE MONEY.
*Input Format: int selection, double amountInserted
* Output Format: one line Constraints: 0.0 <= amountInserted <= 100.0
* */