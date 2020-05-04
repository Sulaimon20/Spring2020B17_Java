package day00_ReplIt.Methods;

import java.util.Arrays;

public class AssessmentTest3Reverse {
    public static void main(String[] args) {
    String [] arr={"python", "typescript"};
        System.out.println(Arrays.toString((arr)));

       System.out.println(Arrays.toString(reverse(arr)));

   }

    public static String[] reverse(String[] arr) {

        String[] newArr = new String[arr.length];
        int j = arr.length-1;
        for (int i=0; i<arr.length;i++){
            newArr[i] = arr[j];
            j--;
        }

        return newArr;

    }
}
/*
input: ["apple", "pear"]
output: ["pear", "apple"]
 */