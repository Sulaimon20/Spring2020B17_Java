package day21_MultiDimensionalArray;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int [] arr1D={1,2,3,4};//[1, 2, 3, 4]
        System.out.println(Arrays.toString(arr1D));// this is only for one dimensional array
        //Arrays.toString created  only for 1 array
        int [][] arr2D={{1,2,3,4},{5,6,7,8,9}};
        System.out.println(Arrays.toString(arr2D));//[[I@7b23ec81, [I@6acbcfc0]
        System.out.println(Arrays.deepToString(arr2D));// [[1, 2, 3, 4], [5, 6, 7, 8, 9]]
    //              index       0      1         3          4
        int [][][] arr3D={ {{1,2,3},{4,5,6}}, {{7,8,9},{10,11,12}}  };
        //          index           0                  1
        System.out.println(Arrays.deepToString(arr3D[1]));//[[7, 8, 9], [10, 11, 12]]
        System.out.println(Arrays.deepToString(arr3D)); //[[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]]]

        System.out.println(Arrays.toString(arr3D[0][1]));//[4, 5, 6]
        //arr3D[1][1][2]
        System.out.println(arr3D[1][1][2]); //12
    }
}
