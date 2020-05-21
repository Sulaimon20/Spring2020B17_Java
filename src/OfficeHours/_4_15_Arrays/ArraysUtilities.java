package OfficeHours._4_15_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {

        int[] arr = {9, 56, 3, 2, 7, 23};
        Integer [] arr1={2,3,4,5,6,7,8};


        int [] salaries={233200,3543451,345102,67804,345345};
        Arrays.sort(salaries);

        System.out.println(Arrays.toString(salaries));
        System.out.println(salaries[salaries.length-1]);//max
    }
}