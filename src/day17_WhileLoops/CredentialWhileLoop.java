package day17_WhileLoops;

import java.util.Scanner;

public class CredentialWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String username = input.next();

        System.out.println("Enter password");
        String password = input.next();

        boolean valid = ((username.equals("cybertek") && password.equals("cybertek123")));
        int count = 1;

        while (!valid) {
            // true
            System.out.println("Please, re-enter your credention");
            System.out.println("Enter user name");
            username = input.next();

            System.out.println("Enter password");
            password = input.next();

            count++;
            if (count == 3 && !valid) {
                System.out.println("Your account is locked");
                break;
            }
        }

        if (valid) {
            System.out.println("Logged in");
        }
    }
}