package day10_Switch_Scanner;

import java.util.Scanner;

public class scanner_Even_Odd_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int num1 = input.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("You number is even");
        } else {
            System.out.println("Your number is odd");
        }
        input.close();
    }
}

