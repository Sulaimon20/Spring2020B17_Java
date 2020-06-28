package day00_Re_Studying.InterveiwQ.MaxMinNumb;

import java.util.Arrays;

public class minMaxPractice {
    public static void main(String[] args) {
        int [] nums={-34,4,12,9,1,99};
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        System.out.println(a);

        //System.out.println(minNumber(nums));
        //System.out.println(maxNumber(nums));

    }
    public static int minNumber(int [] nums){
        int minNumber=Integer.MAX_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            if (minNumber<nums[i]){
                minNumber=nums[i];
            }
        }


        return minNumber;
    }
    public static int minNumberSortMethod(int [] nums){
        int minNumber=0;

        for (int i = 0; i <nums.length ; i++) {

        }


        return minNumber;
    }

    public static int maxNumber(int [] nums){
        int maxNumber=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            if (maxNumber<nums[i]){
                maxNumber=nums[i];
            }
        }
        return maxNumber;
    }


}
