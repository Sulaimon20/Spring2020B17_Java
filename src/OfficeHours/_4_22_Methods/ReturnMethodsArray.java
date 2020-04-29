package OfficeHours._4_22_Methods;

import java.util.Arrays;

public class ReturnMethodsArray {
    public static void main(String[] args) {
        int [] arr={100,2,56,34,400, 78,43,1,76, -5, -100};
        System.out.println(Arrays.toString(arr));

        int arr2=secondMax(arr);
        System.out.println(arr2);
    }
        public static int secondMax(int [] arr){
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            int num=arr[arr.length-2];
            return num;
        }
}
