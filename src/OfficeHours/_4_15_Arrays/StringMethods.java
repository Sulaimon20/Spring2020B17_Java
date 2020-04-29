package OfficeHours._4_15_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Cybertek";
        char[] ch1=str.toCharArray();// []

        System.out.println(str.length()==ch1.length);//true

        String str2="ABC";
        String str3="BAC";
        char [] ch2 = str2.toCharArray();
        char [] ch3=str3.toCharArray();
        Arrays.sort(ch2);
        Arrays.sort(ch3);
        System.out.println(Arrays.equals(ch2,ch3));

    }
}
