package day52_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class null_Keyword1 {

    public static void main(String[] args) {

        String str=null;
        String str1="one";

        //int num1=Integer.parseInt(str);//Exception in thread "main" java.lang.NumberFormatException: null
        //int num2=Integer.parseInt(str1);//Exception in thread "main" java.lang.NumberFormatException: null
        //System.out.println(str);
        //System.out.println(str1);
       String [] arr={null, "ABCD", "ABC"};
        System.out.println(arr[2].toLowerCase());

        System.out.println(arr.toString());






    }
}
