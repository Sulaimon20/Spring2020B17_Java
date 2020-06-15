package day23_Methods;

import java.util.Scanner;

public class Methods_withParameters {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you age");
        int age =scan.nextInt();

        //method
        eligibleToBuyAlcohol(age);

    }
        public static void eligibleToBuyAlcohol(int age){

        if (age >=21){
            System.out.println("Eligible to by alcohol");
        }else {
            System.out.println("Eligible to buy milk");
        }
        }



    }



