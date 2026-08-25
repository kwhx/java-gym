package controlFlow;
public class Switch{
    public static void run(){
        System.out.println("THIS REQUIRES CHECKING THE CODEFILE. OPEN IT NIGGA");
        System.out.println("switch syntax revision");
        int n=9;
        switch(n){
            case 1:
                System.out.println("mondih");
                break;
            case 2:
                System.out.println("tuedih");
                break;
            case 3:
                System.out.println("wednedih");
                break;
            default:
                System.out.println("dih");
        }
        System.out.println("when it matches the case, it executes that particular result but it also executes all conditions below it too even if they dont match the case, that's why we use break");
        System.out.println("default is def, leyt's say no case matches the criteria, then def is executed");
    }
}