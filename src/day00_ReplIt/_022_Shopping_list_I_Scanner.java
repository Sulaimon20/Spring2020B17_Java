package day00_ReplIt;

import java.util.Scanner;

public class _022_Shopping_list_I_Scanner {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Item1 and its price:");
            String item1 = scan.next();
            double price1 = scan.nextDouble();

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Enter Item2 and its price:");
            String item2 = scan2.next();
            double price2 = scan2.nextDouble();

            Scanner scan3 = new Scanner(System.in);
            System.out.println("Enter Item3 and its price:");
            String item3 = scan3.next();
            double price3 = scan3.nextDouble();


            double totalPrice = price1 + price2 + price3;
            System.out.println("Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: " + price3);
            System.out.println("Total price: " + totalPrice);
        }
    }

