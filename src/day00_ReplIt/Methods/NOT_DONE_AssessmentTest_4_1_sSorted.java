package day00_ReplIt.Methods;

import java.util.Arrays;

public class NOT_DONE_AssessmentTest_4_1_sSorted {
    public static boolean isSort(int[] nums)
    {
        int [] nums1 = new int [nums.length];
        for (int i=0; i<nums.length; i++){
            nums1[i]=nums[i];}
        Arrays.sort(nums);
        if (Arrays.equals(nums1,nums)){
            return true;
        }else{
            return false;
        }
  }

    public static void main(String[] args) {
        int [] nums={2,3,5,4,9};
        System.out.println(isSort(nums));
    }
}
/*
int [] nums={2,3,5,4,9};
        int [] nums2={9,3,5,4,2};
        int [] nums3={2,3,5,4,9};
        System.out.println(Arrays.equals(nums,nums2));
        System.out.println(Arrays.equals(nums,nums3));
        Arrays.sort(nums);
 */