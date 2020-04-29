package day11_Scanner;

import java.util.Scanner;

public class Scanner_PrimitiveVar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter true or false: ");
         boolean bool=input.nextBoolean();
        System.out.println(bool);
        System.out.println("===================");

        System.out.println("input your sentence: ");
        String word=input.next(); // ONLY the first word
        System.out.println(word);
        input.close();
    }
}