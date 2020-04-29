package day00_ReplIt;

import java.util.Scanner;

public class _035_Gift_Card_ArthimeticOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();


        int Charger=15;
        int USB_cable=10;
        int Headphones=30;
        int Pants=50;
        int  Hat =25;
        int  Socks=5;
        int  Blanket=60;
        int  Pillow= 40;

        int balance=100;

        if (item.equalsIgnoreCase("Smartphone")|| item.equalsIgnoreCase("Laptop")){
                 System.out.println("Sorry, not enough funds on your gift card!");
            }else if (item.equalsIgnoreCase("Charger")) {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+(balance-Charger+"$"));
             } else if (item.equalsIgnoreCase("USB cable")) {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: "+(balance-USB_cable+"$"));
             } else if (item.equalsIgnoreCase("Headphones")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(balance-Headphones+"$"));

            } else if (item.equalsIgnoreCase("Pants")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(balance-Pants+"$"));
        }else if (item.equalsIgnoreCase("Hat")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(balance-Hat+"$"));
        }else if (item.equalsIgnoreCase("Socks")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - Socks+"$"));
        }else if (item.equalsIgnoreCase("Blanket")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - Blanket+"$"));
        }else if (item.equalsIgnoreCase("Pillow")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - Pillow+"$"));

        }else{
            System.out.println("Invalid item!");
        }

    }
}
