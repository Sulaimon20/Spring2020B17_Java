package day24_ReturnMethods.WarmUp;

import java.util.Scanner;

public class CalculatorStringChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        for (int i=1; true;) {
            System.out.println("Enter you first number");
            double num1 = scan.nextDouble();
            System.out.println("Enter you first number");
            double num2 = scan.nextDouble();
            System.out.println("Input the operation: (*, /, +, -)");
            String operation = scan.next();
            if (operation.equals("*")) {
                System.out.println(multiplication(num1, num2));
            } else if (operation.equals("-")) {
                System.out.println(subtraction(num1, num2));
            } else if (operation.equals("/")) {
                System.out.println(division(num1, num2));
            } else if (operation.equals("+")) {
                System.out.println(addition(num1, num2));
            } else {
                System.out.println("Invalid");
            }

            System.out.println("Would you like to continue?");
            String answer = scan.next();
            if (!answer.equalsIgnoreCase("Yes")){
                System.out.println("Please, re-enter correct answer");
                }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }

    }
    public static double multiplication(double num1, double num2){
        double result =num1+num2;
        return result;
    }
    public static double subtraction (double num1, double num2){
        double result =num1-num2;
        return result;
    }
    public static double addition (double num1, double num2){
        double result =num1+num2;
        return result;
    }
    public static double division (double num1, double num2){
        if (num1 == 0){
            System.out.println("Number cannot be divided by zero");
        }
        if (num2==0){
            System.out.println("Error");
        }
        double result = num1/num2;
        return result;
    }
}

