package OfficeHours._4_15_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Concat2Arrays {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {6, 7, 8, 9};
        int [] arr3={2,3,4,5,6};
        int [] arr12=new int [arr1.length+arr2.length];

//meth 1 using arraycopy
        System.arraycopy( arr1, 0, arr12, 0, arr1.length);
        System.arraycopy( arr2, 0, arr12, arr2.length, arr2.length );






    }
}