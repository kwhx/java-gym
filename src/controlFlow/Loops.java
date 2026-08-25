package controlFlow;
public class Loops{
    public static void run(){
        System.out.println("THIS REQUIRES CHECKING THE CODEFILE. OPEN IT NIGGA");
        System.out.println("loops: (what my girlfriend keeps me in");
        System.out.println("best way to learn loops is debugging lmao cuz that makes you see and visualise what's actually happening behind the hood, works if you know systems well");
        //while gon fuh my memory buffer
        System.out.println("While eg below:");
        int temp1=1;
        while (temp1<=4){
            System.out.println("hi"+temp1);
            int temp2=0;
            while(temp2<=2){
                System.out.println("hello"+temp2);
                temp2++;
            }
            temp1++;
            System.out.println(temp1+" "+temp2);
        }

        System.out.println("Do while eg below:");
        int marks =90;
        do{
            System.out.println("blow me");
        }while(marks<70);

        System.out.println("for eg below:");
        int i;
        int y=0;
        for (i = 0; i<=7; i++){
            if(i!=0) {
                System.out.println("Day " + i);
                for(y=9;y<=17;y++){
                    System.out.println("time: "+y);
                }
            }
        }
        System.out.println(i +" " +y);

        System.out.println("Enhanced for loop below:");
        int[] nums = {10, 20, 30};
        for (int n : nums) {
            System.out.println(n);
        }
        System.out.println("Full execution order of for loop: initialization => condition true => body => update => condition true => body => update => ... => condition false => exit");
    }
}