package day14_StringClass;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        String validUserName="Cybertek";
        String validPassword="cybertekschool";

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username");
        String inputUserName=input.next();
        System.out.println("Enter your password");
        String inputPassword=input.next();
        boolean validCredential=inputUserName.equals(validUserName)&&inputPassword.equals(validPassword);

        if (validCredential){
            System.out.println("Log in successfully");
//            if(validUserName.equals(inputUserName)&&){
        }else{
            System.out.println("Invalid credentials");
        }

        input.close();
    }

}
