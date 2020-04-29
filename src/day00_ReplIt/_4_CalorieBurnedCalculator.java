package day00_ReplIt;

import java.util.Scanner;

public class _4_CalorieBurnedCalculator {
    public static void main(String[] args) {
        double weight = 0;
        double cal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");

        weight=scan.nextInt();
        double weightKg = weight / 2.2;

        double calForRun = 0.0175 *10 * weightKg * 30;
        double calForBasket = 0.0175*8* weightKg* 30;
        double calForSleep = 0.0175* 1 * weightKg* 360;

        cal =calForRun+ calForBasket+calForSleep;
        int totalcal=(int)cal;
        System.out.println("Calories Burned: "+totalcal);



    }

}
/*
cal = 0.0175 * MET * Weight in kilograms

Write a program that asks user to enter his weight in pounds, and then calculates and outputs
the total number of calories burned for a  person who runs 6 MPH for 30 minutes,
plays basketball for 30 minutes, and then sleeps for 6 hours. One kilogram is equal to 2.2 pounds.
 */