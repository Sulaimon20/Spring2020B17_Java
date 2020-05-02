package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniquesCollectionsArrayList {
    public static void main(String[] args) {


        Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        ArrayList<Character> result = new ArrayList<>();// the uniques characters gonna be in here


        for (int i = 0; i < charList.size(); i++) {
            int count = Collections.frequency(charList, charList.get(i));// gonna give us the first element from ArrayList
            if (count == 1) {
                result.add(charList.get(i));
            }
        }
        System.out.println(result);//[B, C]

// for each loop
        for (Character each : charList) {
            int count = Collections.frequency(charList, charList.get(each));// gonna give us the first element from ArrayList
            if (count == 1) {
                result.add(charList.get(each));
            }
        }
            System.out.println(result);



    }
}
