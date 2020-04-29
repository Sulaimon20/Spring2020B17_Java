package day00_ReplIt.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class NOT_DONE_149Methods_addToArray_VoidMethods {


    public static void main(String[] args) {


        int[] r = {1, 5, 77, 8};
        int n = 2;

        int[] arr = new int[r.length + 1];// we create new Array with the match size
        for (int i=0; i<r.length; i++){
            arr[i]=r[i];//[1, 5, 77, 8, 0]  we store the numbers to new array

        }
        arr[arr.length-1]=n;
        System.out.println(Arrays.toString(arr));

    }
}