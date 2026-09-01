/*
* Difficulty: Intermediate Concepts Tested: String switch semantics (equals-based, case-sensitive, exact match)

Examples:
"START" → SYSTEM STARTING
"STATUS" → SYSTEM STATUS: OK
"start" → UNKNOWN COMMAND

Important Edge Cases: empty string "", a string with different casing.

This Exercise Tests: that String switch uses .equals() semantics — exact, case-sensitive match — unlike a loose "close enough" comparison.
* Problem Statement:
    * Read a String command.
    * Switch on it: "START" → SYSTEM STARTING, "STOP" → SYSTEM STOPPING, "PAUSE" → SYSTEM PAUSED, "RESUME" → SYSTEM RESUMED, "STATUS" → SYSTEM STATUS: OK,
    * anything else → UNKNOWN COMMAND.
* Input Format: String command (one line)
* Output Format: one line
* Constraints: any string, length ≤ 30
* */
import java.util.Scanner;
class router{
    public static void main(String a[]){
        Scanner inp=new Scanner(System.in);
        String cmd=inp.next();
        switch(cmd){
            case "START"-> System.out.println("SYSTEM STARTING...");
            case "STOP"-> System.out.println("SYSTEM STOPPING...");
            case "PAUSE"-> System.out.println("SYSTEM PAUSED...");
            case "RESUME"-> System.out.println("SYSTEM RESUMED...");
            case "STATUS"-> System.out.println("SYSTEM STATUS: OK");
            default-> System.out.println("UNKNOWN COMMAND");
        }
    }
}