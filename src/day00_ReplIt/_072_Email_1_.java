package day00_ReplIt;

import java.util.Scanner;

//In this task, you need to swap the first name with the last name in the email.
// If the email doesn't contain underscore - do not do anything.
public class _072_Email_1_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {
            String firstName = email.substring(0, email.indexOf("_"));//Mike
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));//Tyson
            String domain = email.substring(email.indexOf("@"));
            System.out.println(lastName + "_" + firstName + domain);
        }else {
            System.out.println(email);
        }



     //   } else {
       //     System.out.println(email);
        //}
    }
}
/*

 */