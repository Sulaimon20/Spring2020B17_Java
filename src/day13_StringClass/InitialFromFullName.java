package day13_StringClass;

import java.util.Scanner;

public class InitialFromFullName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter you full name");
        String fullName=input.nextLine();//Sulaimon Shokh

        String firstName=fullName.substring(0,fullName.indexOf(" ") );//Sulaimon
        String lastName=fullName.substring(fullName.indexOf(" ")+1  );//Shokhzoda


        String firstName1=(firstName.substring(0,1));
        String lastName1=(lastName.substring(0,1));

        System.out.println(firstName1.toUpperCase());
        System.out.println(lastName1.toUpperCase());


    }

    public static String convertName(String name){

        String [] Split = name.split(" ");

        String firstName=name.substring(0,name.indexOf(" ") );//Sulaimon
        String lastName=name.substring(name.indexOf(" ")+1  );//Shokhzoda

        String firstName1=(firstName.substring(0,1));
        String lastName1=(lastName.substring(0,1));

        System.out.println(firstName1.toUpperCase());
        System.out.println(lastName1.toUpperCase());

        return firstName1.toUpperCase() + "." +lastName1.toUpperCase();


    }

}
