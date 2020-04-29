package day00_ReplIt.Arrays;

import java.util.Scanner;

public class _114_ArraysFind_nonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below
        int count=0;
        for(int j=0;j<nums.length;j++) {
            for(int k =0; k<nums.length;k++) {
                if(nums[j] == nums[k]) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(nums[j]);
                break;
            }
            count = 0; }
    }
}
