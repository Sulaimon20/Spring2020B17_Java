package OfficeHours._4_15_Arrays;

import java.util.Arrays;

public class compareNumbers {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        int [] arr2={2,3,1};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(arr==arr2);
    }
}
