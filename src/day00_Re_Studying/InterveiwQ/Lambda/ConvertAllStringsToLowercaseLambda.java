package day00_Re_Studying.InterveiwQ.Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertAllStringsToLowercaseLambda {
    public static void main(String[] args) {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(alphabets);
        alphabets.replaceAll( e -> e.toLowerCase() );
        System.out.println(alphabets);
    }
}
