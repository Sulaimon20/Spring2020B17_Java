package day00_Re_Studying.InterveiwQ.Reverse;

import java.util.ArrayList;
import java.util.Comparator;

public class reversedArrayList {
    public static void main(String[] args) {
        //Method 1
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.sort(Comparator.comparingInt(Integer::intValue).reversed());
        System.out.println(arr);

        //Method2
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        for (int k = list1.size(); k >= 0; k--) {
            int num = k;
            System.out.println(num);
        }
    }


}
/*
 write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
 */