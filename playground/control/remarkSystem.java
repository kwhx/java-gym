/*
* Difficulty: Intermediate-Advanced Concepts Tested: strict priority among independent disqualifying conditions, boundary-precise nested grade banding

Examples:
marks=95, attendance=90, flagged=1 → DISQUALIFIED
marks=80, attendance=60, flagged=0 → DETAINED
marks=85, attendance=80, flagged=0 → PASS - B
marks=35, attendance=90, flagged=0 → FAIL

Important Edge Cases: attendance exactly 75 (must NOT be detained — boundary is inclusive the "good" way); marks exactly at each grade threshold; flagged=1 overriding an otherwise-perfect record. This Exercise Tests: strictly ordered independent gating conditions, plus boundary-precise nested classification within the final passing branch.
* Problem Statement: Given marks (0–100), attendancePercent (0–100), isFlaggedForMisconduct (0/1):
* if flagged → DISQUALIFIED (highest priority, checked first, regardless of marks/attendance).
* Else if attendance < 75 → DETAINED (marks irrelevant).
* Else, compute a letter grade from marks (A≥90, B≥75, C≥60, D≥40, F<40):
* if the grade is F → FAIL, otherwise → PASS - <grade>.
*Input Format: int marks, int attendancePercent, int isFlaggedForMisconduct
* Output Format: one line Constraints: as stated above
* */
import java.util.Scanner;
class remarks{
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        int marks=input.nextInt();
        int attendance=input.nextInt();
        boolean isFlagged=input.nextBoolean();
        if(isFlagged){
            System.out.println("DISQUALIFIED");
        }else if (attendance<75){
            System.out.println("DETAINED");
        }else{
            if(marks>=90){
                System.out.println("PASS - A");
            }else if(marks>=75){
                System.out.println("PASS - B");
            }else if(marks>=60){
                System.out.println("PASS - C");
            }else if(marks>=40){
                System.out.println("PASS - D");
            }else if(marks<40){
                System.out.println("FAIL");
            }
        }
    }
}