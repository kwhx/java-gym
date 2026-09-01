/*
* Difficulty: Beginner-Intermediate Concepts Tested: combining &&/|| with correct grouping, an overriding condition

Problem Statement: Read age (int), hasGuardian (0/1), hasTicket (0/1).
* Entry is allowed only if the person has a ticket AND (age ≥ 12 OR (age < 12 AND has a guardian)).
* \Print ENTRY ALLOWED or ENTRY DENIED.

Input Format: int age, int hasGuardian, int hasTicket
* Output Format: one line
* Constraints: 0 <= age <= 100; other fields ∈ {0,1}

Examples:
age=10, hasGuardian=1, hasTicket=1 → ENTRY ALLOWED
age=10, hasGuardian=0, hasTicket=1 → ENTRY DENIED
age=20, hasGuardian=0, hasTicket=0 → ENTRY DENIED (no ticket overrides an otherwise-eligible age)
Important Edge Cases: age exactly 12, hasTicket=0 combined with an otherwise-perfect profile.
This Exercise Tests: correctly grouping mixed &&/|| logic with parentheses, and building in an overriding requirement.
* */
import java.util.Scanner;
class ticketElig{
    /*public static void main(String a[]){
        Scanner takeInput =  new Scanner(System.in);
        int age=takeInput.nextInt();
        int hasGuardian=takeInput.nextInt();
        int hasTicket=takeInput.nextInt();
        if((hasTicket==1)&&(age>=12||(age<12&&hasGuardian==1))){
            System.out.println("ENTRY ALLOWED");
        }else{
            System.out.println("ENTRY DENIED");
        }
    }
}*/

//WHAT IF WE HAD TO USE BOOLEAN??
        public static void main(String a[]){
        Scanner takeInput = new Scanner(System.in);
        int age=takeInput.nextInt();
        boolean hasGuardian=takeInput.nextBoolean();
        boolean hasTicket=takeInput.nextBoolean();
        //Entry is allowed only if the person has a ticket AND (age ≥ 12 OR (age < 12 AND has a guardian)).
        if((hasTicket)&&((age>=12)||(age<12&&hasGuardian))){
            System.out.println("ENTRY ALLOWED");
        }else{
            System.out.println("ENTRY DENIED");
        }
        }
}