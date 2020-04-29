package day00_ReplIt;

import java.util.Scanner;

public class _024_Patient_information_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
        System.out.println("Enter your first name");
        String firstName=scan.next();
        System.out.println("Enter your last name");
        String lastName=scan.next();
        System.out.println("Enter your email");
        String email=scan.next();
        scan.nextLine();
        System.out.println("Enter your street");
        String street=scan.nextLine();
        System.out.println("Enter your city");
        String city=scan.next();
        System.out.println("Enter your state");
        String state=scan.next();
        System.out.println("Enter your zip code");
        int zipCode=scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhone=scan.nextLong();


        System.out.println("Enter your personal phone number");
        long personalPhone=scan.nextLong();


        System.out.println("Enter your age");
        int age=scan.nextInt();

        System.out.println("Enter your height");
        double height=scan.nextDouble();

        System.out.println("Enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Are you married?");
        boolean marriage=scan.nextBoolean();

        System.out.println("Patient personal information");
        System.out.println("Full name: "+lastName+ ", "+firstName);
        System.out.println("Address: "+street+", " + city+", "+state+" "+zipCode);
        System.out.println("Contacts: "+"work phone number - "+workPhone+", personal phone number - "+personalPhone+", email: "+email);
        System.out.println("Age: "+age+"\nHeight: "+height+"\nWeight: "+weight+" pounds\nMarried?: "+marriage);

    }
}
/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
Declare 2 int variables: age, zipcode
Declare 2 double variables: height, weight.
Declare boolean variable: isMarried (for marriage status).
Declare 2 long variables: workPhoneNumber and personalPhoneNumber.
 */