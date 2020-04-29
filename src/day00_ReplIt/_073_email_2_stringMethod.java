package day00_ReplIt;

import java.util.Scanner;

public class _073_email_2_stringMethod {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName=email.substring(0,email.indexOf("_") );
        String lastName=email.substring(email.indexOf("_")+1, email.indexOf("@"));

        String domain=email.substring(email.indexOf("@")+1, email.indexOf("."));
        String topLevelDomain=email.substring(email.indexOf(".")+1);

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+topLevelDomain);

    }


}
