package day12_JavaRecap;

import java.util.Scanner;

public class scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); // Enter
        //7921 JonesBranch Dr, McLean VA,22034

        System.out.println("Buildig Number: ");
        int Bnumber=input.nextInt();//7925

        System.out.println("Street: ");
        String street = input.nextLine();

        System.out.println("Street IS");
        input.close();




    }
}
