package day00_ReplIt;


import java.util.Scanner;

public class _030_Shopping_list_or_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();// item1 name
        int count1=scan.nextInt(); //item1 count
        double price1 = scan.nextDouble(); // item1 price

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2=scan.nextInt(); //item1 count
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3=scan.nextInt();
        double price3 = scan.nextDouble();

        double sum1=count1*price1;
        double sum2=count2*price2;
        double sum3=count3*price3;
        double totalSum =sum1 +sum2 + sum3;

        String report="";
        if (sum1==0){
            report="Item2: " + item2 + " Price: " + sum2 + ", Item3: " + item3 + " Price: " + sum3;
        } else if (sum2==0){
            report="Item1: " + item1 + " Price: " + sum1 + ", Item3: " + item3 + " Price: " + sum3;
        } else if (sum3==0){
            report="Item1: " + item1 + " Price: " + sum1 + ", Item2: " + item2 + " Price: " + sum2;
        }
            System.out.println(report);
            System.out.println("Total price: " + totalSum);
        }
        }

/*
Display prompt "Enter Item2, count and its price:"
Cheese
0
3.5
In this assignment you will write a program to create a shopping list, count and prices.
Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your
instructor! You will use Scanner object and ask user to enter 3 items followed by its count,
price and you will calculate total price and show as a report.


 */