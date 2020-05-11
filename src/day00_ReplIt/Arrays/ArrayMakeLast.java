package day00_ReplIt.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMakeLast {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int size = scan.nextInt();
        //int[] nums = new int[size];
        //for(int i =0; i < size; i++) {
          //  nums[i] = scan.nextInt();
        //}
        //WRITE YOUR CODE HERE
        int[] nums ={3, 4, 5, 6};
        int [] newArr=new int [nums.length*2];
        for (int i=0; i<nums.length;i++){
            newArr[newArr.length-1]=nums[nums.length-1];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
