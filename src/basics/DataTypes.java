package basics;
public class DataTypes{
    public static void run(){
        System.out.println(" Java has 8 primitive datatypes as follows:");
        System.out.println("byte; 8 bit signed int; -128 to 127");
        System.out.println("short; 16 bit signed int; -32768 to 32767");
        System.out.println("int; 32 bit signed int; -2^31 to 2^30");
        System.out.println("long; 64 bit signed int; -2^63 to 2^62; uses convention \'L\'");
        System.out.println("char; 16 bit unsigned UTF 16 code unit;");
        System.out.println("float; 32 bit ieee 754 floating pt type; provides precision upto 6 decimals; uses convention \'f\'");
        System.out.println("double; 64 bit ieee 754 floating pt type; provides precision upto 15 decimals");
        System.out.println("boolean; jvm dependent representation (usually 1 byte); true/false");
        System.out.println("And reference types as follows: string, array, object, etc.");
        System.out.println("A. Java supports bases in literals i.e int x = 100 = 0b1100100 = 0144 = 0x64");
        System.out.println("B. One can use underscores for readability, i.e. int mil = 1_000_000");
        System.out.println("C. char can participate in numeric ops");
        System.out.println("D.null means a reference points to no object; primitive types can't hold null, reference types can");
        System.out.println("E. Signed= allows both +ves and -ves; Unsigned=-ves not allowed ");
        System.out.println("F. Instead of memorizing the long ass range values of datatypes, one can use range constants: \".MIN_VALUE\" & \".MAX_VALUE\"");
        System.out.println("G. Imp: Range constants can only be used on wrapper classes, e.g: Integer is the wrapper for int, similarly Long, Float, Double, Character, etc.");
    }
}