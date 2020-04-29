package day20_ArraysContinue;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int[] arr2={1,2,3,4};
        System.out.println(Arrays.equals(arr,arr2));// true

        int [] arr5={3,2,1,4};
        int[] arr6={1,2,3,4};
        System.out.println(Arrays.equals(arr5,arr6));// false

        int [] arr3={3,2,1,4};
        int[] arr4={1,2,3,4};
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        boolean results=Arrays.equals(arr3,arr4);//true
        System.out.println(results);

        int [] arr7={3,2,1,4};
        int[] arr8={1,2,3};
        Arrays.sort(arr7);
        Arrays.sort(arr8);
        boolean results2=Arrays.equals(arr7,arr8);//false
        System.out.println(results2);


    }
}
