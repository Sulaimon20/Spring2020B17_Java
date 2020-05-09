package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSwap {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","A","C","D"));
        System.out.println(Arrays.asList(list));

        Collections.swap(list,0,1);

        System.out.println(Arrays.asList(list));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //switch the numbers {1,2,3,4,5}
        Collections.swap(numbers,0,4);//
        System.out.println(numbers);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mary", "Tom", "Tom", "Tom", "Todd", "Rooth", "Smith"));//Irina



        Collections.replaceAll(names,"Tom", "Irina");
        System.out.println(names);


    }
}
