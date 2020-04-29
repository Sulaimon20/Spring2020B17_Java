package OfficeHours._4_22_Methods;

import java.util.Arrays;

public class maxNum {
    public static void main(String[] args) {
        int [] arr={1,34,65,-1,0, 34};


        System.out.println(max(arr));
       System.out.println(max(arr));
       System.out.println(min(arr));
       System.out.println(min(arr));

    }
    public static double max(double [] arr){
        double result=0;
        Arrays.sort(arr);

        return result = (int)arr[arr.length-1];
    }
    public static int[] max(int [] arr){
        Arrays.sort(arr);
        int [] result= arr;

        return result ;
    }
    public static int min(int [] arr){
        int result=0;
        Arrays.sort(arr);

        return result = arr[0];
    }

}
