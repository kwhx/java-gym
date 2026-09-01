/*
* Difficulty: Beginner Concepts Tested: traditional switch, case, break, default

Problem Statement: Read an integer 1–7.
* Print the corresponding day name (Monday … Sunday) using a traditional switch with break on every case. Anything outside 1–7 → INVALID DAY.

Input Format: int day
* Output Format: one line
* Constraints: -10 <= day <= 20

Examples:
1 → Monday
7 → Sunday
9 → INVALID DAY

Important Edge Cases: 0, negative values, exactly 7.

This Exercise Tests: clean case/break/default usage for a discrete, known value set.
* */
import java.util.Scanner;
class numToName{
    public static void main(String a[]){
        int input;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Which day of week is today??: ");
        input=takeInput.nextInt();
        switch(input){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}