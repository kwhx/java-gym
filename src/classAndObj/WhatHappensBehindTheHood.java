package classAndObj;
public class WhatHappensBehindTheHood {
    public static void run() {
        System.out.println("=======What Happens Behind The Hood======");
        System.out.println("Local variable: a variable declared inside a method.");
        System.out.println("Instance variable: a variable that belongs to an object.");
        System.out.println("Reference variable: a variable that refers to an object. A reference variable does not contain the object itself. It contains a reference to an object on the heap. Think of it like a way to find/reach the object.");
        System.out.println(" \nRole of stack: Each thread has a JVM stack. Every method call creates a stack frame on that stack. Local variables and method-call information are stored in the frame. When the method finishes, its stack frame is removed.");
        System.out.println("\n Rolw of heap: Objects are created in heap memory. Instance variables are stored as part of their object. Objects live independently of the method that created them.");
        System.out.println("\n--- Example ---");
        System.out.println("Calculator calc = new Calculator();");
        System.out.println("Calculator => class/type");
        System.out.println("new Calculator() => creates an object on the heap");
        System.out.println("calc => reference variable");
        System.out.println("The reference in calc points to the Calculator object.");

        Calculator calc = new Calculator();
        calc.number = 10;

        System.out.println("\ncalc is a local reference variable.");
        System.out.println("number is an instance variable belonging to the Calculator object.");
        System.out.println("calc.add() uses the object referenced by calc.");

        calc.add();

        System.out.println("\n=== Simple Mental Model ===");
        System.out.println("STACK  => method calls + local variables + references");
        System.out.println("HEAP   => objects + their instance variables");
        System.out.println("CLASS  => definition/blueprint used to create objects");
    }
}

class Calculator {
    int number; // instance variable => belongs to each Calculator object

    void add() { // method
        int result = number + 5; // local variable => current method's stack frame
        System.out.println("Result: " + result);
    }
}