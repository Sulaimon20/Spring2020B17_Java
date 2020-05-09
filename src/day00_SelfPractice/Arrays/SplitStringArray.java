package day00_SelfPractice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SplitStringArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first and last names and age");
        String s = inp.nextLine();//Mike, Deen, 31
        person(s);
    }
    public static void person(String info) {
        String [] Split = info.split(",");
        System.out.println(Arrays.toString(Split));

        String result = "person name: " + Split[0] + " last name: " +
                Split[1] + " age: " + Split[2];
        System.out.println(result);
    }
}
