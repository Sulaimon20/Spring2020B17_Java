package day00_ReplIt.Arrays;

import java.util.Scanner;

public class _083_Party_Loop_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String guestsList="";
        while(true){
            System.out.println("Please enter guest name:");
            String name=input.nextLine();
            guestsList += name + ", ";
            System.out.println("Do you want to enter new guest name:");
            name=input.nextLine();

            if(name.equalsIgnoreCase("yes")){
            }else if(name.equalsIgnoreCase("no")){
                System.out.println("Guest's list: "+ guestsList.substring(0,guestsList.length()-2));
                System.exit(0);
            }
        }


    }
}
