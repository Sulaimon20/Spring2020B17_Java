package day00_ReplIt;

import java.util.Scanner;

public class _076_Build_a_route_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if (start==end){
            System.out.println(start+ "found");}
            else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B")){
            System.out.println("right: B found");}
            else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C")){
            System.out.println("right > down: C found");}
            else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D")){
            System.out.println("right > down > left: D found");}
            else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("C")){
            System.out.println("down: C found");}
            else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("D")){
            System.out.println("down > left: D found");}
            else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("D")){
            System.out.println("left: D found");}
        else{
            System.out.println("");
        }




    }
}
