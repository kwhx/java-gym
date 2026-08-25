import java.util.Scanner;
import basics.Intro;
import basics.DataTypes;
import basics.Operators;
import controlFlow.Switch;
import controlFlow.Loops;

class Main {
    public static void main(String a[]) {
        Scanner topicInput = new Scanner(System.in);
        System.out.println("1. Intro");
        System.out.println("2. Data Types");
        System.out.println("3. Operators");
        System.out.println("4. Switch");
        System.out.println("5. Loops");
        System.out.println("0. Exit");
        System.out.print("Choose a concept: ");
        int concept = topicInput.nextInt();
        switch (concept) {
            case 1:
                Intro.run();
                break;
            case 2:
                DataTypes.run();
                break;
            case 3:
                Operators.run();
                break;
            case 4:
                Switch.run();
                break;
            case 5:
                Loops.run();
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}