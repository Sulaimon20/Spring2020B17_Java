package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        /* ask the user enter yes or no
        if user enters other that yes or no, repeat the previous step
         */
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Yes or No");
        String word=input.next();

        boolean valid=word.equalsIgnoreCase("Yes")||word.equalsIgnoreCase("No");
        while (!valid){//repeats infinite time
            System.out.println("please, re-enter");
            word=input.next();
            if (valid=word.equalsIgnoreCase("Yes")||word.equalsIgnoreCase("No")){
                break;
            }
        }

        if (word.equalsIgnoreCase("Yes")){
            System.out.println("Entered yes");
        }if (word.equalsIgnoreCase("No")) {
            System.out.println("Entered No");

        }
    }
}
