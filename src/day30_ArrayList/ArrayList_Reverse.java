package day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ArrayList_Reverse {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            list.add(i);
        }

        System.out.println(list);//[1, 2, 3, 4, 5]

        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            System.out.print(each + " ");
        }
        System.out.println("\n========================");
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Array: " + Arrays.toString(arr));
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("ArrayList before: " + list1);
        int nums = 0;
        for (int i = 0; i < arr.length; i++) {
            nums = arr[i];
            list1.add(nums);
        }

        System.out.println("ArrayList after: " + list1);
        System.out.println("==========================");


    }
}
/*
 write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
 */