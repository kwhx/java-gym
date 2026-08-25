/*
* Difficulty: Intermediate Concepts Tested: priority-ordered else-if among multiple simultaneously-qualifying conditions, String comparison

Problem Statement: Read purchaseAmount (double), isMember (0/1), couponCode (String, possibly ""). Apply exactly one discount, by priority: coupon "SAVE20" → 20% off (checked first, overrides membership); else member AND amount ≥ 100 → 15% off; else member (any amount) → 10% off; else amount ≥ 200 → 5% off; else 0%. Print DISCOUNT: X% and FINAL PRICE: Y.YY.

Input Format: double purchaseAmount, int isMember, String couponCode Output Format: two lines Constraints: 0 <= purchaseAmount <= 100000

Examples:

amount=150, member=1, coupon="SAVE20" → DISCOUNT: 20% / FINAL PRICE: 120.00
amount=250, member=0, coupon="" → DISCOUNT: 5% / FINAL PRICE: 237.50
amount=50, member=1, coupon="" → DISCOUNT: 10% / FINAL PRICE: 45.00

Important Edge Cases: a member who'd also qualify for a higher membership tier but has a coupon — coupon must still win per priority order; amount exactly at 100 and 200; empty-string coupon must not accidentally match "SAVE20".

This Exercise Tests: priority-based else-if ordering when multiple conditions could independently qualify, plus correct (not ==) String comparison.
* */