package day00_ReplIt;

import java.util.Scanner;

public class _067_Reverse_it_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String reverseWord="";
        if (word.length()==5) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reverseWord)) {
                System.out.println(reverseWord);
            } else {
                System.out.println(reverseWord);
            }
        } else if (word.length()<5){
            System.out.println("Too short!");
        }else {
            System.out.println("Too long!");
        }


    }
}
/*

Write a program that will reverse a string. Your program should
reverse a string only 5 characters long. If word is shorter, display message:
 "Too short!". If word is longer, display message: "Too long!". Otherwise,
 reverse this word and print out result into the console.
 */