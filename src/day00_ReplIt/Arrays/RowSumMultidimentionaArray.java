package day00_ReplIt.Arrays;

public class RowSumMultidimentionaArray {
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int[] sums = rowSums(a);
        for(int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }
    public static int[] rowSums(int[][] nums)
    {   int [] newArr=new int[nums.length];
        for (int x=0; x<nums.length;x++){
            for (int y=0; y<nums[x].length;y++){
                newArr[x]+= (nums[x][y]);
            }
        }

        return newArr;
    }
}
