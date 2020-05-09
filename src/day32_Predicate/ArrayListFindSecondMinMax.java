package day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListFindSecondMinMax {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        list.add(1.2);
        list.add(1.4);
        list.add(1.6);
        list.add(1.7);
        list.add(1.29);
        list.add(-1.21);
        System.out.println(Arrays.asList(list));
        System.out.println(Collections.min(list));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
        // second max: 3
        // second min: 2

        Integer maxNum= Collections.max(numbers);
        numbers.removeAll(Arrays.asList(maxNum));
        System.out.println(numbers);
        int secondMax=Collections.max(numbers);
        System.out.println(secondMax);
        System.out.println("==============================================");
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));

        Integer minNum=Collections.min(numbers2);//1
        numbers2.removeAll(Arrays.asList(minNum));//remove all the min numbers 1,1
        System.out.println(numbers2);
        Integer secondMin= Collections.min(numbers2);
        System.out.println(secondMin);//2

    }
}
