package classAndObj;
public class MethodOverloading{
    public static void run(){
        System.out.println("Method Overloading: Same method name, different parameters. You can have multiple methods with the same name as long as their parameters are different." );
        //The JVM/compiler looks at what arguments you provide and chooses the matching method.
        System.out.println("Check example in codefile for below:");
        Money rupees = new Money();
        int myMoney=rupees.addMeDaddy(1,2)+rupees.addMeDaddy(3,4,5);
        System.out.println("You have "+ myMoney);
    }
}

class Money{
    public int addMeDaddy(int a, int b){
        return a+b;
    }
    public int addMeDaddy(int a, int b, int c){
        return a+b+c;
    }
}