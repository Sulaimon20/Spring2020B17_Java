package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculatory {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();//100000

        input.nextLine();

        System.out.println("Enter your full name:");
        String fullName=input.nextLine();

        System.out.println("Enter the company name:");
        String companyName=input.nextLine();

        System.out.println("Enter your SSN:");
        long ssnNumber=input.nextLong();// 123234234234

        input.nextLine();

        System.out.println("Enter your job title:");
        String jobTitle=input.nextLine();

        System.out.println("Full name is:  "+fullName);
        System.out.println("Job title is:  "+jobTitle);
        System.out.println("Company name:  "+companyName);
        System.out.println("SSN:           "+ssnNumber);
        System.out.println("Salary:        "+salary);
        input.close();

    }
}
