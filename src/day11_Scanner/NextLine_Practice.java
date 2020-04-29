package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter you age: ");
        byte age=input.nextByte();

        System.out.println("Your age is "+age);

        Scanner input2=new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName=input2.nextLine();

        System.out.println("Your full name is: "+fullName);
        input.close();
    }
}
