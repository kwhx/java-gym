/*
* Difficulty: Intermediate Concepts Tested: priority-ordered else-if among multiple simultaneously-qualifying conditions, String comparison

Examples:
amount=150, member=1, coupon="SAVE20" → DISCOUNT: 20% / FINAL PRICE: 120.00
amount=250, member=0, coupon="" → DISCOUNT: 5% / FINAL PRICE: 237.50
amount=50, member=1, coupon="" → DISCOUNT: 10% / FINAL PRICE: 45.00

Important Edge Cases: a member who'd also qualify for a higher membership tier but has a coupon — coupon must still win per priority order;
* amount exactly at 100 and 200; empty-string coupon must not accidentally match "SAVE20".

This Exercise Tests: priority-based else-if ordering when multiple conditions could independently qualify, plus correct (not ==) String comparison.
Problem Statement: Read purchaseAmount (double), isMember (0/1), couponCode (String, possibly "").
        Apply exactly one discount, by priority:
        coupon "SAVE20" → 20% off (checked first, overrides membership);
        else member AND amount ≥ 100 → 15% off;
        else member (any amount) → 10% off;
        else amount ≥ 200 → 5% off;
        else 0%.
        Print DISCOUNT: X% and FINAL PRICE: Y.YY.
* Input Format: double purchaseAmount, int isMember, String couponCode
* Output Format: two lines
* Constraints: 0 <= purchaseAmount <= 100000
*/
import java.util.Scanner;
class mydis{
    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Purchase amt: ");
        double purchaseAmount=input.nextDouble();
        System.out.println("Is customer a member??: ");
        int isMember=input.nextInt();
        input.nextLine(); //imp: related to buffer, need to consume the newline, or else the strimg below will consume it
        System.out.println("Coupon code: ");
        String couponCode=input.nextLine();
        double actualDis;
        if(couponCode=="SAVE20"){ //this is wrong, correct way of string comparison in java is: if (couponCode.equals("SAVE20")){
            actualDis=20;
        } else if(isMember==1&&purchaseAmount>=100){
            actualDis=15;
        } else if (isMember==1){
            actualDis=10;
        }else if(purchaseAmount>=200){
            actualDis=5;
        } else{
            actualDis=0;
        }
        double calculatedDis=(actualDis/100)*purchaseAmount;
        double finalPrice=purchaseAmount-calculatedDis;

        System.out.println("DISCOUNT: "+actualDis+"%");
        System.out.println("FINAL PRICE: "+finalPrice); //wrong; problem asks for FINAL PRICE: Y.YY; correct way shall be %.2f
    }
}
