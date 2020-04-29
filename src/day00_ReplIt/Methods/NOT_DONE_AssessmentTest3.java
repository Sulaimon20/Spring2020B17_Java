package day00_ReplIt.Methods;

import java.util.Arrays;

public class NOT_DONE_AssessmentTest3 {
    public static void main(String[] args) {
    String [] arr={"apple", "pear"};
       System.out.println(Arrays.toString(reverse(arr)));

   }

    public static String[] reverse(String[] arr) {

        String arr1=arr[0].replaceAll(arr[0],arr[1]);
         String arr2=arr[1].replaceAll(arr[1],arr[0]);
         String [] arr3= {"\""+arr1+"\", \"" +arr2+"\""};
         arr=arr3;
         return  arr;

    }
}
/*
input: ["apple", "pear"]
output: ["pear", "apple"]
 */