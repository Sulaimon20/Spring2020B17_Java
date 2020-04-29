package day00_Re_Studying.InterveiwQ.DescendingOrder;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        System.out.println("Converting the below numbers in array in descending order:");
        int [] arr={3,45,1,47,676,-10,43};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("1) first we do sort it in ascending order:\n"+Arrays.toString(arr));// we sort it
        int []RevArr=new int [arr.length];// create a new arrays with zero numbers

        int j=arr.length-1;                 // we create a variable that match a length of array
        for (int i=0; i<arr.length; i++){   //we increase a index (i for RevArr)
            RevArr[i]=arr[j];               // RevArr[index(i)]=arr[numbers(j)]
            j--;                            // we reduce the numbers (j by 1)
        }
        System.out.println("2) Then we do sort it in descending order:\n"+Arrays.toString(RevArr));
    }
}
