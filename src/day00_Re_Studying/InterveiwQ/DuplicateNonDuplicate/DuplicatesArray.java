package day00_Re_Studying.InterveiwQ.DuplicateNonDuplicate;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesArray {
    public static void main(String[] args) {

        ArrayList<String> str=new ArrayList<>(Arrays.asList("owl", "eagle", "goldfish","eagle",
                "goldfish", "goldfish", "eagle"));

        String str2="green apple";
        char[] ch=str2.toCharArray();



       //3 stage to create regular loop
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
            if (count > 1&& !duplicates.contains(str.get(i))) {
                duplicates.add(str.get(i));
            }
        }
        System.out.println(duplicates.remove(0));
    }
}
