package day12_JavaRecap.WarmUp;

import java.util.Scanner;

public class ScannerRevenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product price:");
        double price=input.nextDouble();
        System.out.println("Enter the quantity:");
        int quantity=input.nextInt();
        double sumWithDiscount=price*0.90*quantity;
        int discount = 10;
        int notDiscount=0;
                double revenue=price*quantity;
        if (quantity>=5000){
            System.out.println("Discount: "+discount+"%"+"\nRevenue: "+revenue);
        }else if (quantity<=5000&&quantity>0) {
            System.out.println("Discount: " + notDiscount + "%" + "\nRevenue: " + revenue);
        }else{
            System.out.println("Invalid value");
        }
        input.close();
    }
}
/*
Revenue can be calculated as the selling price of the product times
the quantity sold, i.e. revenue = price × quantity.
Write a program that asks the user to enter product price and quantity and then calculate
 the revenue.
 If the revenue is more than 5000 a discount is 10% offered.
 Program should display the discount and net revenue.
 */