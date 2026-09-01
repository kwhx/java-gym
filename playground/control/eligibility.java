/*
* Difficulty: Beginner Concepts Tested: if-else, single boundary

Problem Statement: Read an integer age. Print ELIGIBLE if age is 18 or older, otherwise print NOT ELIGIBLE.

Input Format: integer age
* Output Format: one line
* Constraints: 0 <= age <= 130

Examples:
18 → ELIGIBLE
17 → NOT ELIGIBLE
45 → ELIGIBLE

Important Edge Cases: exactly 18, age = 0.

This Exercise Tests: correct binary if-else structure with an inclusive lower boundary.
* */

import java.util.Scanner;
class eligibility{
    public static void main(String a[]){
        Scanner userAge = new Scanner(System.in);
        int age = userAge.nextInt();
        if(age!=0&&age>=18)
            System.out.println("ELIGIBLE");
        else
            System.out.println("NOT ELIGIBLE");
        if(age==0){
            System.out.println("youre 0, not the age");
        }
    }
}