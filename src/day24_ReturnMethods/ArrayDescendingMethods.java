package day24_ReturnMethods;

import java.util.Arrays;

public class ArrayDescendingMethods {
    public static void main(String[] args) {
        int [] arr1={12,43,1,54,12};
        int [] arr2={120,403,10,540,120};
        int [] arr3={121,431,11,541,128};
        arr1=sortDescending(arr1);
        arr2=sortDescending(arr2);
        arr3=sortDescending(arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


    }
    public static int [] sortDescending(int [] arr){
        Arrays.sort(arr);// {1,2,3,4} ====> {4,3,2,1}
        int [] RevArr=new int[arr.length];
        //        i incr j - decrease
        // RevArr[0]=arr[3]
        // RevArr[1]=arr[2]
        // RevArr[2]=arr[1]
        // RevArr[3]=arr[0]
        int j=arr.length-1;
        for (int i=0; i<arr.length; i++){
           RevArr[i]=arr[j];
           j--;
        }
        return RevArr;
    }
}
