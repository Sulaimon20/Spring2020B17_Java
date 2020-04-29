package day17_WhileLoops;

import java.util.Scanner;

public class MaxNumberFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int MaxNumber=-999999999;// any number the user provided will be greater than this number
        //first user entered variable will be initialized to MaxNumber
        for (int i = 1; i < 6; i++) {//6 ====> the quantity time of question
            System.out.println("Enter a number");
            int num=input.nextInt();
            if(num>MaxNumber){
                MaxNumber=num;
            }
                    }
        System.out.println(MaxNumber);
    }
}
//0 5 1 3 0