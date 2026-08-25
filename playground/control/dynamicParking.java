/*
* Difficulty: Advanced Concepts Tested: switch for discrete rate lookup combined with a progressive/segmented tiered calculation (not a single-threshold pick)

Problem Statement: Given vehicleType (char: 'C' car, 'B' bike, 'T' truck) and hoursParked (double). Base hourly rate via switch: C=$2.00, B=$1.00, T=$3.50; anything else → INVALID VEHICLE TYPE (skip fee calculation). Billing is progressive: the first 2 hours are billed at full rate; any portion of hours from 2 up to 8 gets 20% off; any portion beyond 8 gets 40% off. Print FEE: X.XX.

Input Format: char vehicleType, double hoursParked Output Format: one line Constraints: 0 < hoursParked <= 24

Examples:

vehicleType='C', hours=1 → FEE: 2.00
vehicleType='C', hours=5 → FEE: 8.80 (2hrs@2.00=4.00, +3hrs@1.60=4.80)
vehicleType='T', hours=10 → FEE: 28.00 (2hrs@3.50=7.00, +6hrs@2.80=16.80, +2hrs@2.10=4.20)

Important Edge Cases: hours exactly 2.0 (no discount tier applies at all, base rate only); exactly 8.0 (second tier fully applies, third tier not reached); an invalid vehicle type skips fee output entirely. This Exercise Tests: switch for discrete lookup paired with genuinely segmented (progressive) if-based billing — meaningfully harder than a single-threshold price pick, and a preview of the tax-bracket pattern in Level 5.
* */