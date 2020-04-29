package day00_Re_Studying.InterveiwQ.Factorial;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
//      5!=5*4**3*2*1=120
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int result=1; // 20

            while(num > 1){
                result =result*num;
                num--; }
            System.out.println(result);

    }
}
