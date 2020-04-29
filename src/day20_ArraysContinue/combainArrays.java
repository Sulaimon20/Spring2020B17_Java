package day20_ArraysContinue;

import java.util.Arrays;

public class combainArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8};
        int [] arr2 = {9,10,11,12,13};
// FIRST we putting together arr1 and arr2
        int [] arr3 = new int [arr1.length+arr2.length];
        System.out.println(Arrays.toString(arr3));//0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
// SECOND we are counting array 1
        for (int i=0; i<arr1.length; i++){
            arr3[i]=arr1[i];}
        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 4, 5, 6, 7, 8, 0, 0, 0, 0, 0]
// THIRD we are counting array 2
        for (int i=0; i<arr2.length; i++){
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));//
// FOURTH we retrieve arrays by Arrays.toString(arr3) method

        System.out.println(Arrays.toString(arr3));

}
}
