package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class maxNumCollection {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
        Integer maxNumber= Collections.max(numbers);
        System.out.println(maxNumber);

        Integer minNumber=Collections.min(numbers);
        System.out.println(minNumber);


        ArrayList <Character> alphabet1=new ArrayList<>();
        for (Character i='A'; i<'Z'; i++){
            alphabet1.add(i);
        }
        System.out.println(alphabet1);

        ArrayList <String> alphabet=new ArrayList<>();






    }
}
