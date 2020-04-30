package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation_addAll {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //add 20,30,340,506,506
       //Method1
        /*
        list.add(20);
        list.add(30);
        list.add(340);
        list.add(506);
        list.add(506);
        */
        //Method2
        //list.addAll(Arrays.asList(20,30,340,506,506));

        //Method3
        Integer [] arr1={20,30,340,506,506};
        list.addAll(Arrays.asList(arr1));
        System.out.println(list);

        String [] names={"Anna", "Mike", "Tom", "Jim"};
        System.out.println(Arrays.toString(names));
        ArrayList<String> names1=new ArrayList<>();
        names1.addAll(Arrays.asList(names));
        names1.add("Muhtar");
        System.out.println(names1);

        // shorter way

        Integer[] numbers={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> names2=new ArrayList<>(Arrays.asList(numbers));
        System.out.println(names2);











    }
}
