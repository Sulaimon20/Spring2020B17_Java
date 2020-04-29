package day18_DoWhileNestedLoop;

import java.util.Scanner;

public class roomReservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int price=0;
        System.out.println("Welcome to the *St. Regis Bal Harbour Resort*!!!");

        while (true) {
            System.out.println("Please, choose the rooms you want to reserve: -\"King\" - \"Queen\" - \"Single\"");
            String answer = input.next();
            if (answer.equalsIgnoreCase("King")) {
                price += 120;
            } else if (answer.equalsIgnoreCase("Queen")) {
                price += 100;
            } else if (answer.equalsIgnoreCase("Single")) {
                price += 80;
                }while (!((answer.equalsIgnoreCase("King"))||(answer.equalsIgnoreCase("Queen"))
                ||(answer.equalsIgnoreCase("Single")))){
                    System.out.println("Invalid entry!");
                    break;
                }
            System.out.println("How many nights do you want to stay:");
            int nights=input.nextInt();


            System.out.println("Would you like to reserve another room?");
            String answer2=input.next();
            if (answer2.equalsIgnoreCase("yes")){
                continue;
            }else {

                System.out.println("You have a wonderful day! Thank you!");
                System.out.println("You total is: $"+price*nights);
                System.exit(0);
            }
        }
    }
}


