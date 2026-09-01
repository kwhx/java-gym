/*
* Difficulty: Intermediate Concepts Tested: traditional switch, grouping multiple case labels via fall-through

Examples:
'B' → SATISFACTORY
'F' → FAIL
'Z' → INVALID GRADE

Important Edge Cases: lowercase 'b' → INVALID GRADE (case-sensitive), verifying the grouped B/C cases don't accidentally fall further into D.

This Exercise Tests: fall-through-based grouping of multiple case labels to one shared outcome, with break placed only after the group's final case.

* Problem Statement: Read a char grade (A,B,C,D,F, uppercase only).
*  Using a traditional switch, group cases so multiple labels share one action: A → EXCELLENT; B and C → SATISFACTORY (grouped);
* D → NEEDS IMPROVEMENT; F → FAIL;
* anything else → INVALID GRADE.
*Input Format: char grade
* Output Format: one line
* Constraints: any char
* */
import java.util.Scanner;
class grades{
    public static void main(String a[]){
        Scanner inp=new Scanner(System.in);
        char grade=inp.next().charAt(0);
        switch(grade){
            case 'A':
                System.out.println("EXCELLENT");
                break;
            case 'B':
            case 'C':
                System.out.println("SATISFACTORY");
                break;
            case 'D':
                System.out.println("NEEDS IMPROVEMENT");
                break;
            case 'F':
                System.out.println("FAIL");
                break;
            default:
                System.out.println("INVALID GRADE");
                break;
        }
    }
}