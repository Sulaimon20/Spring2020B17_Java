package day52_Collection.Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _LinkedHashSet {
    public static void main(String[] args) {

        Set<String> names1=new LinkedHashSet<>();
        names1.add("Anna");
        names1.add("Anna");
        names1.add("Anna");
        names1.add("Anna");
        names1.add("Radik");
        names1.add("Alex");
        names1.add("David");
        System.out.println(names1);//[Anna, Radik, Alex, David]

        String [] arr={"A", "A", "C", "B", "A"};

        LinkedHashSet<String> set1=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1);//[A, C, B]

        Set<String> set2=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set2);//[A, C, B]
    }
}
