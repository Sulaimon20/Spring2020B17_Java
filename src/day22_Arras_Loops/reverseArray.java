package day22_Arras_Loops;

import java.util.Arrays;

public class reverseArray {
 //write a program that can reverse the array
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        for (int i=arr.length-1; i >= 0; i--){
            int eachNum=arr[i];
            System.out.println(eachNum); //5,4,3,2,1
                    }
        System.out.println("=================");
        int [] RevArr = new int[arr.length]; // [0,0,0,0,0] we gonna form an array with 0 numbers in it
        System.out.println(Arrays.toString(RevArr));
        // we gonna place the numbers to the array
        int j=arr.length-1;                 // we create a variable that match a length of array
        for (int i=0; i<arr.length; i++){   //we increase a index (i for RevArr)
            RevArr[i]=arr[j];               // RevArr[index(i)]=arr[numbers(j)]
            j--;                            // we reduce the numbers (j by 1)
        }
        System.out.println(Arrays.toString(RevArr));//[5,4,3,2,1]
    }
}
