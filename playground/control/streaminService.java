/*
* Difficulty: Beginner Concepts Tested: nested if, correct scoping, an outer condition that overrides everything inside it

Problem Statement: Read subscribed (int, 0 or 1) and age (int).
* If not subscribed, print ACCESS DENIED regardless of age. If subscribed: age < 13 → KIDS ACCESS; 13–17 → TEEN ACCESS; 18+ → FULL ACCESS.

Input Format: int subscribed, int age
* Output Format: one line
* Constraints: subscribed ∈ {0,1}, 0 <= age <= 120

Examples:

subscribed=1, age=10 → KIDS ACCESS
subscribed=1, age=15 → TEEN ACCESS
subscribed=0, age=25 → ACCESS DENIED

Important Edge Cases: age exactly 13, exactly 18, subscribed=0 with an age that would otherwise qualify for FULL ACCESS (must still be denied).

This Exercise Tests: nested if-else reasoning, and that an outer gating condition must short-circuit everything nested inside it.
* */

import java.util.Scanner;
class streaming{
    public static void main(String a[]) {
        Scanner takeInput = new Scanner(System.in);
        int age = takeInput.nextInt();
        int subscribed = takeInput.nextInt();
        if (subscribed==0){
            System.out.println("ACCESS DENIED");
        }
        if(subscribed==1){
            if (age<=13){
                System.out.println("KIDS ACCESS");
            }
            else if(age>13&&age<=17){
                System.out.println("TEEN ACCESS");
            }
            else if(age>=18){
                System.out.println("FULL ACCESS");
            }
        }
    }
}