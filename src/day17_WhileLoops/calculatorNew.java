package day17_WhileLoops;

import java.util.Scanner;

public class calculatorNew {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; true;) { // we can use true or -12 or something

            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("Enter second number");
            int num2 = input.nextInt();

            System.out.println("Math operator: ");

            String operator = input.next();     // - + * / %

            if (operator.equals("+")) {
                System.out.println("Addition is: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("Subtraction is: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("Multiplication is: " + (num1 * num2));
            } else if (operator.equals("/")) {
                System.out.println("Multiplication is: " + (num1 / num2));
            } else if (operator.equals("Remainder is: " + "%")) {
                System.out.println(num1 % num2);
            } else {
                System.out.println("Invalid");
            }


            System.out.println("Do you want to continue");
            String answer = input.next();
            if (answer.equalsIgnoreCase("no")) {
                break;

            }

        }
    }
}