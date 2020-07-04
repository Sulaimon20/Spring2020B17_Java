package OfficeHours;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetters {
    /*
    create amethod that will accept a String and be print home many times each characters is found in the String
    Ex: String s="apple";
    a=2
    p=2
    l=1
    e=1
     */
    public static void countLetters(String str){

        Map<Character, Integer> map=new LinkedHashMap<>();
        for (int i=0; i<str.length(); i++){
            char key = str.charAt(i);
            if (!map.containsKey(key)){
                map.put(key,0);
            }

        }


    }


}
