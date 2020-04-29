package day00_ReplIt;

import java.util.Scanner;

public class _045_burger_or_chicken_String {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String in = s.next();
        float price1 = 10;
        float price2 = 2;

        if (in.equalsIgnoreCase("burger") || in.equalsIgnoreCase("chicken")) {
            System.out.println(price1);}

        else if (in.equalsIgnoreCase("soda")) {
            System.out.println(price2); }

        else{
            System.out.println("Invalid input");}

    }
}


