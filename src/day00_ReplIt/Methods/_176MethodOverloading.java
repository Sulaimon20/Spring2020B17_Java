package day00_ReplIt.Methods;

import java.util.Arrays;

public class _176MethodOverloading {
    public static void main(String[] args) {


    }

    public int findMax(int[]arr) {
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        return max;
    }

     public double findMax(double[]arr1) {
         Arrays.sort(arr1);
         double max=arr1[arr1.length-1];
         return max;
        }

}

/*
In this task, you need to write 2 methods findMax() that will find a maximum number in the
array. First method should work with array of integers (int[]) and return int, and second
method should work with an array of doubles (double[]) and return double as a result.
 */