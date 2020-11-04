package day00_Re_Studying.InterveiwQ.MoveZero;

import java.util.ArrayList;
import java.util.Arrays;

public class Move_Zeros_to_the_End {
    public static void main(String[] args) {
         int [] arr={1,0,2,0,3,0,4,0};
        String s = moveZeros(arr).toString();
        System.out.println("s = " + s);
    }
    public static int[] moveZeros(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;
        for (int each : arr) {
            list.add(each);
            countZero += (each == 0) ? 1 : 0;
        }
        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for (int i = 0; i < arr.length - countZero; i++) {
            arr[i] = list.get(i);
        }
        return arr;

    }
}
