package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {

        ArrayList<String> str=new ArrayList<>(Arrays.asList("A", "B","A", "C", "D"));
       //3 stage to create regular loo
        ArrayList<String> duplicates = new ArrayList<>();
        int dupCount=0;
        for (int i=0; i<str.size();i++) {
            // list.get(0) ====>"A" the index of A is 0
            int count = 0;
            for (String each : str) {
                if (each.equals(str.get(i))) {
                    count++;
                }
            }
//      we gonna put the

            if (count > 1&& !duplicates.contains(str.get(i))) {
                duplicates.add(str.get(i));

            }
        }

        System.out.println(duplicates);

    }
}
