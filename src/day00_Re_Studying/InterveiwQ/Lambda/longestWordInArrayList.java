package day00_Re_Studying.InterveiwQ.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class longestWordInArrayList {
    public static void main(String[] args) {
        ArrayList<String> country=new ArrayList<>(Arrays.asList("Tajikistan", "USA", "France", "Canada","Australia"));
        Predicate<String> longestWord= p -> p.length() >=10;
        country.removeIf(longestWord);
        System.out.println(country);
    }
}
