package day00_ReplIt.Arrays;

import java.util.Scanner;

public class _107Arrays_CountEvensLoopArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
        int evenNumber = 0;
        for (int i = 0; i<5; i++){
            if (nums[i]%2==0){
            evenNumber=evenNumber+1; }
        }
        System.out.println(evenNumber);
    }
}

