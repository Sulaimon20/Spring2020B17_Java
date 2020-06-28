package day52_Collection.Set;

import java.util.*;

public class _Set {
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

        HashSet<String> set3=new HashSet<>(Arrays.asList(arr));
        System.out.println(set3);//[A, C, B]

       // Set<Integer> numbers= new TreeSet<>(Arrays.asList(2,65,33,33,2,-1,5,5));
        //System.out.println(numbers);








    }
}
