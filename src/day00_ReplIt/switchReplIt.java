package day00_ReplIt;

import java.util.Scanner;

public class switchReplIt {

            public static void main(String[] args) {
            //WRITE YOUR CODE HERE
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number:");
            byte weekday=input.nextByte();
            String result = "";

            switch (weekday) {   //not true or false
                case 1:
                    result ="Monday";
                    break;
                case 2:
                    result ="Tuesday";
                    break;
                case 3:
                    result ="Wednesday";
                    break;
                case 4:
                    result ="Thursday";
                    break;
                case 5:
                    result ="Friday";
                    break;
                case 6:
                    result ="Saturday";
                    break;
                case 7:
                    result ="Sanday";
                    break;
                default:
                    result = "Invalid Number";


            } System.out.println(result);


        }
    }

