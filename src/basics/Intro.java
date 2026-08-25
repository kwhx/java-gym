package basics;
public class Intro{
    public static void run(){
        System.out.println("A. jshell is where you start");
        System.out.println("B. Java does not necessarily have a 'main file', execution begins from the main method of the class you launch");
        System.out.println("C. \"public static void main(String a[])\" is the entrypoint of the program");
        System.out.println("D. the reason why java is called WORA (write once run anywhere) is that if you wanna run the same program on some other machine, the other machine need not have " +
                "the jdk, if it only has the jre the program will run there too");
        System.out.println("E. Java source code (.java) is compiled by javac into bytecode (.class)");
        System.out.println("F. Bytecode is not machine code, it is instructions meant for the JVM. Java is generally described as a compiled language because source code is compiled into bytecode. The bytecode is then executed by the JVM, using interpretation and JIT compilation. The JVM loads and executes the bytecode on the current operating system");
        System.out.println("G. JDK = tools needed to develop Java programs + runtime components");
        System.out.println("H. JRE = runtime environment needed to run Java programs");
        System.out.println("I. JVM = the engine that executes Java bytecode");
        System.out.println("J. javac belongs to the JDK and compiles .java source code into .class bytecode");
        System.out.println("K. java launches the JVM and runs the compiled bytecode");
        System.out.println("L. java is a strongly typed language (requires the programmer to mention the datatpe of variable");
        System.out.println("M. Java manages memory automatically using garbage collection. Objects that are no longer reachable can eventually be reclaimed by the JVM");
        System.out.println("The basic flow is: .java source code => javac => .class bytecode => JVM => program execution");
    }
}