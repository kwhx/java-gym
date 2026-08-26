package classAndObj;
public class IntroTheory {
    public static void run() {
       System.out.println("Every object knows something, every object does something");
        System.out.println("A class is a blueprint that defines what an object knows and does.");
        System.out.println("The JVM creates and manages objects at runtime. Basically understand it simply as jvm manufacturing the object at runtime while you just design it when you write the code");
        System.out.println("below, calc is a reference var, not a primitive, we create the class Calculator, to use the functionality of Calculator class we create a new object Calculator() in the present class we are in, the reference variable helps us use the methods in Calculator class");
        System.out.println("Class = reusable blueprint/definition.\n" +
                "        Object = actual instance made from that blueprint.\n" +
                "        Reference variable = way to reach that object.\n" +
                "        Method = something that object can do.");

        System.out.println("Example below: (check code)");
        MyCalculator calc = new MyCalculator(); //Create a Calculator object and let calc refer to it
        System.out.println("Sum of 2&3 is " + calc.add(2,3) + " and product is " + calc.prod(2,3)+" and when subtracted they give " + calc.sub(2,3) + " and when divided "+ calc.divide(2,3)); //Go to the Calculator object that calc refers to and call its add() method



    }
}

class MyCalculator{   //class
    public int add(int a, int b){   //method
        System.out.println("im in Calculator class");
        return a+b;
    }
    public int prod(int a, int b){
        return a*b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}