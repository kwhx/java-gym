## Amusement Park Ride Authorization & Pricing System
**Difficulty:** Capstone
**Concepts Tested:** everything in this curriculum, priority-ordered gating, switch+if combination, a short-circuiting membership tier, loop over multiple riders, no arrays/collections needed

**Problem Statement:**

Read an integer `T`, the number of riders, then loop over `T` riders. For each rider, read: `age` (int), `heightCm` (int), `hasGuardian` (0/1), `membershipType` (String: `"NONE"`, `"BASIC"`, `"PREMIUM"`, `"VIP"`), `dayType` (String: `"WEEKDAY"`, `"WEEKEND"`, `"HOLIDAY"`), `rideType` (char: `'K'` kiddie, `'S'` standard, `'X'` extreme).

**Eligibility** (checked in this exact priority order, report only the first failing reason):
1. **Height requirement** by ride: `K` ≥ 90cm, `S` ≥ 120cm, `X` ≥ 150cm. If not met → `REJECTED: HEIGHT REQUIREMENT NOT MET`.
2. **Age/guardian requirement** by ride: `X` requires `age ≥ 16` **OR** (`age ≥ 12` **AND** has a guardian); `S` requires `age ≥ 8` **OR** has a guardian; `K` has no age/guardian requirement at all. If not met → `REJECTED: AGE/GUARDIAN REQUIREMENT NOT MET`.

**Pricing** (only computed if eligible):
- Base price by ride (switch): `K`=$5, `S`=$10, `X`=$20.
- Day multiplier: `WEEKDAY` ×1.0, `WEEKEND` ×1.25, `HOLIDAY` ×1.5.
- Membership discount, applied to the day-adjusted price, in this priority order: `VIP` → the price is **flatly $0.00**, and this check should short-circuit the rest of the pricing math entirely (no day multiplier applies,  VIP is always free regardless of day); `PREMIUM` → 30% off; `BASIC` → 10% off; `NONE` → no discount.

Print, per rider, either the rejection message or `APPROVED, PRICE: X.XX`.

**Input Format:** int T, then T groups of: int age, int heightCm, int hasGuardian, String membershipType, String dayType, char rideType
**Output Format:** one line per rider
**Constraints:** `1 <= T <= 1000`; `0 <= age <= 120`; `50 <= heightCm <= 250`

**Examples:**
- `age=20, height=160, guardian=0, membership="PREMIUM", day="WEEKEND", ride='X'` → `APPROVED, PRICE: 17.50` (base 20 × 1.25 = 25.00, then 30% off = 17.50)
- `age=10, height=95, guardian=0, membership="NONE", day="WEEKDAY", ride='S'` → `REJECTED: HEIGHT REQUIREMENT NOT MET` (95 < 120, checked and failed before age is even considered)
- `age=10, height=130, guardian=0, membership="NONE", day="WEEKDAY", ride='S'` → `APPROVED, PRICE: 10.00` (age 10 ≥ 8 satisfies the age/guardian requirement alone)
- `age=13, height=155, guardian=0, membership="VIP", day="HOLIDAY", ride='X'` → `REJECTED: AGE/GUARDIAN REQUIREMENT NOT MET` (13 < 16, and guardian is 0, so the alternate path also fails,  VIP membership is irrelevant since this rider never reaches pricing)
- `age=30, height=160, guardian=0, membership="VIP", day="HOLIDAY", ride='X'` → `APPROVED, PRICE: 0.00` (VIP is free regardless of the HOLIDAY multiplier)

**Important Edge Cases:** heights exactly at `90`, `120`, `150` must pass; ages exactly at `16`, `12`, `8` must pass; a guardian is irrelevant whenever age alone already qualifies; `VIP` must produce `0.00` on every day type, including `HOLIDAY`, proving the day multiplier is genuinely short-circuited rather than just multiplied by zero at the end; the height check must always be evaluated before the age/guardian check, never the reverse.