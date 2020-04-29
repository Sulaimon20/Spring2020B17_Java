package day20_ArraysContinue;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int [] arr1={9,8,7,6,10,19,-56,4,31,12,0};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("THe first min number is "+arr1[0]);
        System.out.println("THe first max number is "+arr1[arr1.length-1]);


    }
}
