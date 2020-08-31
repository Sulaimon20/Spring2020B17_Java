package day00_Re_Studying.InterveiwQ.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class countryNamesRemove {
    public static void main(String[] args) {
    ArrayList<String> countries=new  ArrayList<>(Arrays.asList( "United States of America", "England", "Tajikistan", "France", "Turkmenistan"));
        Predicate<String>removeCountries= p -> p.length()>=10;
        countries.removeIf(removeCountries);
        System.out.println(countries);



    }



    }

