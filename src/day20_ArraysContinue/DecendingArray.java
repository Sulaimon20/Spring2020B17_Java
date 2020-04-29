package day20_ArraysContinue;

import java.util.Arrays;

public class DecendingArray {
    public static void main(String[] args) {
        int[] arr={2,56,1,34,364,-100,3,6};
        int [] arrDesc=new int [arr.length];//[0, 0, 0, 0, 0, 0, 0, 0]
        Arrays.sort(arr);//               //  [-100...............364]
        System.out.println(Arrays.toString(arr));

        int k=0;
        for (int i=arr.length-1; i>=0; i--){
           arrDesc[k]=arr[i];
           k++;
        }
        System.out.println(Arrays.toString(arrDesc));


    }
}
