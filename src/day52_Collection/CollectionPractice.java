package day52_Collection;

import OfficeHours._06_03_Array.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionPractice {
    public static void main(String[] args) {
        //String str="ABABABCDEF";
/*
    String[] arr=str.split("");
    System.out.println(Arrays.toString(arr));//[A, B, A, B, A, B, C, D, E, F]

    LinkedHashSet<String>ls=new LinkedHashSet<>(Arrays.asList(arr));//[A, B, C, D, E, F]

        System.out.println(ls);
        String result="";

        for (String each:ls) {
            result+=each;
        }
        System.out.println(result);

         */
        String str="ABABABCDEF";
        String[] arr=str.split("");
        str="";
        for (String each : new LinkedHashSet<>(Arrays.asList(arr))) {
            str+=each;
        }
        System.out.println(str);//  ABCDEF

        String str1="ababababaab";
        String str2="baba";
        String [] arr1=str1.split("");//[a, b]
        String [] arr2=str2.split("");//[a, b]

        TreeSet<String>t1=new TreeSet<>(Arrays.asList(arr1));//[a, b] [a, b]
        TreeSet<String>t2=new TreeSet<>(Arrays.asList(arr2));
        System.out.println(t1);//
        System.out.println(t2);//

        str1=t1.toString();
        str2=t2.toString();
        System.out.println(str1+" "+str2);

        //3 method
        String str3="ababababaabC";
        str3=new TreeSet<>(Arrays.asList(str.split(""))).toString();
        System.out.println(str3);//[A, B, C, D, E, F]



    }
}
