package day00_Re_Studying.InterveiwQ.timeComplexity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class find2Sum {
    /*
      You can use a HashMap to solve the problem in O(n) time complexity. Here are the steps:
Initialize an empty HashMap.
Iterate over the elements of the array.
For every element in the array -
If the element exists in the Map, then check if it’s complement (target - element) also exists in the Map or not. If the complement exists then return the indices of the current element and the complement.
Otherwise, put the element in the Map, and move to the next iteration.

     */
    public static void main(String[] args) {

        int [] nums={2,7,15,11};
        int target=9;
        int[] twoSum = findTwoSum(nums, target);
        System.out.println("twoSum = " + Arrays.toString(twoSum));

    }
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }


}
