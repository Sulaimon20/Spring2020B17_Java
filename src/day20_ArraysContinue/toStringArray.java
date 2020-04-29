package day20_ArraysContinue;

import java.util.Arrays;

public class toStringArray {
    public static void main(String[] args) {
        String str1="Cybertek School";
        String str2="School Cybertek";

        char [] ch1=str1.toCharArray();
        char [] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch1));

            boolean equalsStr=Arrays.equals(ch1,ch2);

            System.out.println(equalsStr);

    }
}
