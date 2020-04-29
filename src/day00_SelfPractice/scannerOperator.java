package day00_SelfPractice;
import java.util.Scanner;
public class scannerOperator {
            public static void main(String[] args)   {

            Scanner input = new Scanner (System.in); //     here is input commander
            System.out.print("Input your first name: "); // here the system print the question
            String firstname = input.next();
            System.out.print("Input your last name: ");
            String lastname = input.next();
            System.out.println();
            System.out.println("Hello \n"+firstname+" "+lastname);
                input.close();
            }
    }


