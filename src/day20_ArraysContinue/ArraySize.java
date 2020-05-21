package day20_ArraysContinue;

public class ArraySize {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        //          0 1 2
        int [] nums=new int [2];// 0~1 ONLY!!!!!!!!!!!!!!!!!!!
        nums[0]=10;
        nums[1]=20;

        System.out.println(nums[0]);//10
        System.out.println(nums[1]);//20

        nums=new int[3];// reset {0,0,0}

        System.out.println(nums[0]);//0
        System.out.println(nums[1]);//0
        System.out.println(nums[2]);//0
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        System.out.println(a.length);

    }
}
