package day00_ReplIt.Arrays;
import java.util.*;
public class ArraysAddElements {
    public static int[] addElements(int[] ints1, int[] ints2) {


        int[] add = new int[5];
        for (int i = 0; i < ints1.length; i++) {
                add[i] = ints1[i] + ints2[i];
        }
        return add;
    }

    public static void main(String[] args) {
        int[]ints1={10, 40, 50, 3, 1};
        int[] ints2={11, 0, 500, 44, 1101};

        System.out.println(Arrays.toString(addElements(ints1,ints2)));
    }
}
/*
Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements

addElements(new int[][10, 40, 50, 3, 1],
            new int[][11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]
 */
