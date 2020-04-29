package day21_MultiDimensionalArray;

import java.util.Arrays;

public class Multi_DimentionalArrays {
    public static void main(String[] args) {
        int [] arr={1,2,3};
//                         0 1 2    0 1 2 3
        int [] [] arr2D={ {1,2,3}, {4,5,6,7} };// 2 dimensional arrays
        //          index    0         1
        //          length   1         2
        System.out.println(arr2D.length);// to check the length

        int [] arr1D = arr2D[1];// {1,2,3}
        System.out.println(Arrays.toString(arr1D));
        int num1=arr2D[1] [3];
        System.out.println(num1);//
        //INDEX             0   1      0    1    2      0   1    2
        char [][] ch2D= { {'A','B'}, {'C', 'D', 'F'}, {'G', 'H','I'}};
        // INDEX              0             1                  2

        char  ch1=ch2D[1] [2];
        System.out.println(ch1); // gonna print char F
        char ch2=ch2D[2][2];
        System.out.println(ch2);// gonna print char I
       char [] ch3=ch2D[2];
        System.out.println(Arrays.toString(ch3));// if we want to print the whole array [G, H, I]

    }
}
