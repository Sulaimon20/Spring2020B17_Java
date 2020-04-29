package day11_Scanner;

import java.util.Scanner;

public class employeeInfo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName=input.next();
        System.out.println("Enter your last name:");
        String lastName=input.next();
        String fullName=firstName+" "+lastName;
        System.out.println("Are you employed?:");
        Boolean employedStatus=input.nextBoolean();
        System.out.println("Emloyeed: "+employedStatus);
        double salary=0;
        if (employedStatus==true){
            System.out.println("Enter your salary: ");
            salary=input.nextDouble();
        }else {//NOT Nessecary
            salary=0;
            System.out.println("Salary: "+salary);
        }

        input.close();
    }
}
//FLname
//user employeed or not
//if yes, ask the salary
//if not set the salary =0;
//FIO, employee status
//salary