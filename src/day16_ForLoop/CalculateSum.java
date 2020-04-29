package day16_ForLoop;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();//100
        int sum = 0;//1234567...100
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);//


        int k = 1;
        //WRITE YOUR CODE HERE
        for (k = 0; k <= 97; k++) {
            System.out.print("*");

        }
    }
}