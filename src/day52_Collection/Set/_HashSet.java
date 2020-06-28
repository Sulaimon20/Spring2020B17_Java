package day52_Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class _HashSet {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();
        names.add("Anna");
        names.add("Anna");
        names.add("Anna");
        names.add("Anna");
        names.add("Radik");
        names.add("Alex");
        names.add("David");

        System.out.println(names);//[Alex, Radik, David, Anna]
    }
}
