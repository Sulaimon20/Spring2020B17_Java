package day13_StringClass;

import java.util.Scanner;

public class shippingMailToAdress {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter your full name:");
        String fullName=input.nextLine();

        System.out.println(" Enter the address:");
        String adress=input.nextLine();

        System.out.println("Enter the city and state:");
        String cityAndState=input.nextLine();

        System.out.println("Enter the zip code:");
        int zipCode=input.nextInt();

        System.out.println("Ship to:            "+fullName);
        System.out.println("                    "+adress);
        System.out.println("                    "+cityAndState+zipCode);
    }
}
/*
Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102

write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */