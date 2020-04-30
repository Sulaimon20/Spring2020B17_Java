package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list.contains("D"));//true
        System.out.println(list.contains("Z"));//false

        int [] arr={1,2,3};
        int [] arr1={3,2,1};
        System.out.println(arr.equals(arr1));// false   index is important
        int [] arr2={1,2,3};
        int [] arr3={3,2,1};
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        System.out.println(arr2.equals(arr3));//




    }

}
