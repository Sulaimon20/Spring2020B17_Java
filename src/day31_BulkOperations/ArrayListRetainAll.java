package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListRetainAll {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "A"));

        System.out.println(alphabets);//[A, B, A, D, A]

        alphabets.retainAll(Collections.singleton("A"));//going to remove everything but "A"

        System.out.println(alphabets);//[A, A, A]
    }

}
