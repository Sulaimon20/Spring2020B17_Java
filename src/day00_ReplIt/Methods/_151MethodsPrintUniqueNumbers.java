package day00_ReplIt.Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _151MethodsPrintUniqueNumbers {
    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        printUniqueNumbers(nums);
    }
        public static void printUniqueNumbers(int[] nums){
            //WRITE YOUR CODE HERE

            for (int i = 0; i < nums.length; i++) {//loop started
                // 0..4    0..4 < 4       0..4 +1  loop get continued
                int count =0;//we store in here the unique number loop get continued
                for (int k=0; k<nums.length; k++) { //
                    if (nums[i] == nums[k]) {
                        count++;
                    }
                }
                if (count==1){
                    System.out.println(nums[i]);
                }
            }


    }
}
