package day12_JavaRecap;

import java.util.Scanner;
//
public class ScannerNextorNextLine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

       // System.out.println("Enter your word: ");
        //String str= input.nextLine();
        //System.out.println(str);

        String fulladress="";
        System.out.println("Enter the number of the building: ");
        short Bnumber=input.nextShort();
        fulladress+=Bnumber+"";

        System.out.println("Enter the street name: ");
        String streetName=input.next();
        fulladress+=streetName+"";

        System.out.println("Enter the type of the road");
        String roadType=input.next();
        fulladress+=roadType+" ";

        System.out.println("Enter city name, state, zipcode");
        String cityName=input.next();
        fulladress+=cityName+"";

        String state=input.next();
        fulladress+=state+"";

        int zipCode=input.nextInt();
        fulladress+=zipCode;
        input.close();
    }
}
