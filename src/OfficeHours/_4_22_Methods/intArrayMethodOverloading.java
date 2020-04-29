package OfficeHours._4_22_Methods;

import java.util.Arrays;

public class intArrayMethodOverloading {
    public static void main(String[] args) {

        int [] arr={5,4,3,-23, 456, -62, 2,1};
        System.out.println("Original order: "+Arrays.toString(arr));
        int [] arr2=descending(arr);
        System.out.println("Descending order"+Arrays.toString(arr2));
    }
    public static int [] descending(int [] arr){

        Arrays.sort(arr);

        return arr;
    }
}
