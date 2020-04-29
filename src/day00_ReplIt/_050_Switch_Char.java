package day00_ReplIt;

import java.util.Scanner;

public class _050_Switch_Char {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);

        //WRITE YOUR CODE HERE
        String result="";
        switch (response){
            case 'y':
                result="Your request is being processed is printed";
                break;
            case 'n':
                result="Thank you anyway for your consideration is printed";
                break;
            case 'h':
                result="Sorry, no help is currently available is printed";
                break;
            default:
                result="Invalid entry, please try again!";
        }
        System.out.println(result);


    }
}