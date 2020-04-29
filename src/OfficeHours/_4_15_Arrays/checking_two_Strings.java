package OfficeHours._4_15_Arrays;

import java.util.Arrays;

public class checking_two_Strings {
    public static void main(String[] args) {
        // write a program that can check if two Strings are build out of same
        //        Ex:
        //            if str1 = "aabbbc";  str2 ="cab";
        //            output: true
        //            if str1 ="abcd";  str2 ="abc";
        //            output: false
        //            Hint: you will need array and Arrays' methods
        String str1="aabbbc abcd";
        String str2="cab abc";
        String [] word1=str1.split(" ");//[aabbbc, abcd]
        String [] word2=str2.split(" ");//[cab, abc]

        System.out.println(Arrays.toString(word1));//[aabbbc, abcd]
        System.out.println(Arrays.toString(word2));//[cab, abc]

        System.out.println(Arrays.equals(word1,word2));// false


    }
}
