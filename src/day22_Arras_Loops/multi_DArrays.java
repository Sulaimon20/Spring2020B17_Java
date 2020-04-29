package day22_Arras_Loops;

import java.util.Arrays;

public class multi_DArrays {
// n dimensional array contains (n-1)
    public static void main(String[] args) {
        int [] arr= {1,2,3};

        // 2D array: [index num of ] []
        int [][] arr2D={ {1,2,3}, {4,5,6}, {7,8,9,10}};
        //                  0         1
        int [] arr1D=arr2D[0];//[1,2,3]


        System.out.println(Arrays.toString(arr1D));   //[1,2,3]
        System.out.println(Arrays.toString(arr2D[0]));//[1,2,3]
        System.out.println(Arrays.toString(arr2D[1]));//[4,5,6]
        System.out.println(Arrays.toString(arr2D));   //[[I@7b23ec81, [I@6acbcfc0]
        System.out.println(Arrays.deepToString(arr2D));//[[1, 2, 3], [4, 5, 6]]

        for (int each: arr2D[0]){
            System.out.println(each);// 1,2,3
        }
        for (int i=0; i<arr2D[0].length; i++){
            int num=arr2D[0][i];
            System.out.println(num);
        }

    }
}
