package day13_StringClass;

import java.util.Scanner;

public class credential2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUserName=input.nextLine();
        System.out.println("Enter your password");
        String inputPassword=input.nextLine();

        boolean loggedIn=inputUserName.equals("Cybertek")&& inputPassword.equals("cybertekschool");
        boolean invalidUserName=! inputUserName.equals("Cybertek") && inputPassword.equals("cybertekschool");
        boolean invalidPassword=inputUserName.equals("Cybertek")&& ! inputPassword.equals("cybertekschool");
        if (!inputUserName.isEmpty()&& ! inputPassword.isEmpty()){// inputUserName and inputPassword are not empty
                 if (loggedIn);{
                    System.out.println("Logged in"); // working
                }if (invalidUserName){
                    System.out.println("Password is correct, username is incorrect");
                }else if (invalidPassword){
                    System.out.println("Password is incorrect, username is correct");
                }else{
                    System.out.println("Both username and password are incorrect");
                }

        }else{
            System.out.println("Please enter the credential");
        }
        input.close();
    }
}
