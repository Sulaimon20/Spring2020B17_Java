package day00_ReplIt;

import java.util.Scanner;

public class ForRepitivePractice {

    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workphonenumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalphonenumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        String isMarried = scan.next();
        String Fullname = lastName + ", " + firstName;
        String Address = street + "," + " " + city + "," + " " + state + " " + zipcode;
        System.out.println("Patient personal information");
        System.out.println("Full name: " + Fullname);
        System.out.println("Address: " + Address);
        System.out.println("Contacts: work phone number - " + workphonenumber + ", "
                + "personal phone number - " + personalphonenumber + ", " + "email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);
    }
}
