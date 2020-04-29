package day20_ArraysContinue.day20_WarmUp;

import java.util.Scanner;

public class arrayMonths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] month = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};
        System.out.println("Enter the month number:");

        int num = scan.nextInt();

        System.out.println("The month is "+month[num-1]);
        }


    }

