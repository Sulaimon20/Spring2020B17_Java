package day24_ReturnMethods;

import java.util.Arrays;

public class returnMethodPractice {
    public static void main(String[] args) {
        int [] arr={12,34,5656,1,-1,43,9,2};
        int max = maxNumber(arr);
        int min=minNumber(arr);
        System.out.println(max+" "+min);

    }
    public static int maxNumber(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int minNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int sortDescending(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

}
