package day00_Re_Studying.InterveiwQ.Reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class reversedArrayList {
    public static void main(String[] args) {
        //Method 1
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        arr.sort(Comparator.comparingInt(Integer::intValue).reversed());
        System.out.println(arr);

        //Method2
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        for (int k = list1.size(); k > 0; k--) {
            int num = k;
            System.out.print(num+", ");
        }
    }


}
/*
 write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
 */