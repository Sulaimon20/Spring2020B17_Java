package day00_Re_Studying.Arrays;

import OfficeHours._06_03_Array.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class CharNull {
    public static void main(String[] args) {

        char [] ch={'a','b', ' ','c'};
        if (!ch.equals(null)) {
            System.out.println("ch = " + Arrays.toString(ch));
        }

        ArrayList<Character> ch1=new ArrayList<>();
        ch1.add(ch[0]);
        ch1.add(ch[1]);
        ch1.add(ch[3]);
        System.out.println("ch1 = " + ch1);






    }
}
