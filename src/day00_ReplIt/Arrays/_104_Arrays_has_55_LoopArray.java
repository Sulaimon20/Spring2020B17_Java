package day00_ReplIt.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _104_Arrays_has_55_LoopArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        boolean count ;
        for (int i=0; i<nums.length; i++){
            if (nums[0]==nums[i]){
                count=true;
            }else {
                count=false;
            }
            System.out.println(count);
        }
    }
}
