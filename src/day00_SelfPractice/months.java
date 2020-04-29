package day00_SelfPractice;
import java.util.Scanner;
public class months {
    public static void main(String[] args) {
        System.out.println("                Choose the number of a month from the below table:");
        System.out.println(" _______________________________________________________________________________________");
        System.out.println("|Jan.=1|Feb.=2|March=3|Apr.=4|May=5|June=6|July=7|Aug.=8|Sept.=9|Oct.=10|Nov.=11|Dec.=12|");
        System.out.println(" _______________________________________________________________________________________");


        Scanner input = new Scanner(System.in);
        System.out.println("Input the nubmer?: ");
        int month = input.nextInt();

        int month1 = 31;
        int month2 = 28;
        int month3 = 30;
        if (month == 1) {
            System.out.println("January" + " has has " + month1 + " days");
        }else if (month==2){
            System.out.println("February" + " has has "+month2+" days");
        }else if (month==3){
            System.out.println("March" + " has has "+month1+" days");
        }else if (month==4){
            System.out.println("April" + " has has "+month3+" days");
        }else if (month==5){
            System.out.println("May" + " has has "+month1+" days");
        }else if (month==6){
            System.out.println("June" + " has has "+month3+" days");
        }else if (month==7){
            System.out.println("July" + " has has "+month1+" days");
        }else if (month==8){
            System.out.println("August" + " has has "+month1+" days");
        }else if (month==9){
            System.out.println("September" + " has has "+month3+" days");
        }else if (month==10){
            System.out.println("October" + " has has "+month1+" days");
        }else if (month==11){
            System.out.println("November" + " has has "+month3+" days");
        }else if (month==12){
            System.out.println("December" + " has has "+month1+" days");
            }
        else {
            System.out.println("Invalid number");
        }
    }
}