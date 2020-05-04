package day00_ReplIt.ArrayList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class MethodsWithString12extractNumberFromString {

    public static void main(String[] args) {
        String s = "aa2aa3";
        System.out.println(extractNum(s));
    }


    public static String extractNum(String s) {

        int sum=0;
        String result = "";
        for (int i = 0; i < s.length(); i++){
            char ch= s.charAt(i);
            if (ch>=48 && ch<=57 ){
                result+=ch;
             }
        }
        return result;

    }

}
