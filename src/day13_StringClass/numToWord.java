package day13_StringClass;

import java.util.Scanner;

public class numToWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number:");
        byte num = input.nextByte();
        String result = "";
        //switch (num) {...}
        System.out.println(result);
        String result2 = (num == 0) ? "Zero" : (num == 1) ? "One" : "Invalid";
        System.out.println(result);
    }
}