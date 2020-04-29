package Resources;

import java.util.Scanner;

public class Calculator {
    //Method: multiply with return value
    //Method: subtract with return value
    //divide with return value
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        for (int i=1; true;) {
            System.out.println("Enter you first number");
            double num1 = scan.nextDouble();
            System.out.println("Enter you first number");
            double num2 = scan.nextDouble();
            System.out.println("Input the operation: (multiplication, division, addition, subtraction5)");
            String operation = scan.next();
            if (operation.equalsIgnoreCase("multiplication")) {
                System.out.println(multiplication(num1, num2));
            } else if (operation.equalsIgnoreCase("subtraction")) {
                System.out.println((int) subtraction(num1, num2));
            } else if (operation.equalsIgnoreCase("division")) {
                System.out.println(division(num1, num2));
            } else if (operation.equalsIgnoreCase("addition")) {
                System.out.println(addition(num1, num2));
            } else {
                System.out.println("Invalid");
            }

            System.out.println("Would you like to continue?");
            String answer = scan.next();
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

