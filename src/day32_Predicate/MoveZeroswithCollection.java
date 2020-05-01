package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeroswithCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        //output: [1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println(list);
        int count = Collections.frequency(list,0);
        list.removeAll(Arrays.asList(0));
        for (int i=0; i<count; i++) {
            list.add(0);
        }

        System.out.println(list);

    }
}
