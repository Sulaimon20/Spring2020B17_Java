package day00_ReplIt;
import java.util.Scanner;
public class gameReplit {

        public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        //System.out.println("Enter number of coupons: ");
        //int coupon=input.nextInt();
        //int couponPerCandies=(coupon /10);
        //int couponPerGumballs=(coupon % 2);
            int coupon=46;
            int couponPerCandies=coupon/10;
              int couponPerGumballs=coupon%2;

        if (coupon<=2){
            System.out.println("Not enough coupons");
        }else {

            System.out.println("Number of Candies: " + couponPerCandies);
            System.out.println("Number of Gumballs: " + couponPerGumballs);
        }




}
}
