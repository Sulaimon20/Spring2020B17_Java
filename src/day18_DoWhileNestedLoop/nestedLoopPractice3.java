package day18_DoWhileNestedLoop;

import day12_JavaRecap.Scanner_NextLine2;

import java.util.Scanner;

public class nestedLoopPractice3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Enter two number:");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("Enter the operator (+, -, *, /, %)");
            char ch = input.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("Addition of two numbers:" + (num1 + num2));
                    break;
                case '-':
                System.out.println("Subtraction of two numbers:" + (num1 - num2));
                break;
                case '*':
                    System.out.println("Multiplication of two numbers:" + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Division of two numbers:" + (num1 / num2));
                    break;
                case '%':
                    System.out.println("Remainder of two numbers:" + (num1 % num2));
                    break;
            }
            System.out.println("Do you want to continue");
            String answer = input.next();

          while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))) {
          System.out.println("Invalid entry, please re-enter the two number");
                answer = input.next();
                } if (answer.equalsIgnoreCase("No")) {
                   System.out.println("Thank you for using the calculator");
                   break;
                    }
            }
        }
    }

