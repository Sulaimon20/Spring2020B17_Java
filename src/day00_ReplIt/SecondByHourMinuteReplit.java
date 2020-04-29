package day00_ReplIt;

import java.util.Scanner;

public class SecondByHourMinuteReplit {
    public static void main(String[] args) {
//3695 = 1 hours, 1 minutes, and 35 seconds
        Scanner num = new Scanner(System.in);
        System.out.println("Enter seconds:"); //3695 (1:1:35)= 20394 (5:39:54)
        int input =num.nextInt();
        int hour=input/3600;
        int minute=(input%3600)/60;
        int second=(input%3600)%60; //35

        System.out.println(hour+" hours "+minute+" minutes, and "+second+" seconds");


    }
}
/*
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */

