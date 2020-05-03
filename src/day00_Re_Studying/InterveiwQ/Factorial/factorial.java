package day00_Re_Studying.InterveiwQ.Factorial;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
/*
In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all
positive integers less than or equal to n.  Calculate factorial and output result to the console.
 */
        long result=1;
        while(n > 1){
            result =result*n;
            n--; }

        System.out.println(result);
    }
}
