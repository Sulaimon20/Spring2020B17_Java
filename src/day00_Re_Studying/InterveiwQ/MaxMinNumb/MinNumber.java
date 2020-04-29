package day00_Re_Studying.InterveiwQ.MaxMinNumb;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int MaxNumber=-999999999;// any number the user provided will be greater than this number
        //first user entered variable will be initialized to MaxNumber
        int MinNumber=1999999999;

        for (int i = 1; i <=5; i++) {//6 ====> the quantity time of question

            System.out.println("Enter a number");

            int num=input.nextInt();

            if(num>MaxNumber){
                MaxNumber=num;}

            if (num<MinNumber){
                MinNumber=num;}
        }

        System.out.println(MaxNumber);
        System.out.println(MinNumber);

}
}
