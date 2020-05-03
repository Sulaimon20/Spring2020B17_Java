package day00_ReplIt.Methods;

import java.util.Arrays;

public class NOT_DONE_AssessmentTest3 {
    public static void main(String[] args) {
    String [] arr={"python", "typescript"};
        System.out.println(Arrays.toString((arr)));

       System.out.println(Arrays.toString(reverse(arr)));

   }

    public static String[] reverse(String[] arr) {

        String temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
         return  arr;

    }
}
/*
input: ["apple", "pear"]
output: ["pear", "apple"]
 */