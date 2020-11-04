package day00_Re_Studying.InterveiwQ.Numbers;

import java.util.*;

public class PrintNumberCloseToZero {

    public static void main(String[] args) {

        /*
       From Real coding interview: print out num close to 0 from giving input,, or you can assume
       that you are working on temperature application find a close degree close to 0
         */
        int [] arr={12,10,9,-8,11-11,29};

        int closest = getClosestToZeroMethod1(arr);
        //System.out.println("closest = " + closest);
        int N=0;
        System.out.println("N = " + arr);


    }
    public static int getClosestToZeroMethod1(int[] a) {

        int temp=0;
        //following for sorting an array in ascending
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]) {
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        //to check sorted array with negative & positive  values
        System.out.print("{");
        for(int number:a)
            System.out.print(number + ",");

        System.out.print("}\n");
        //logic for check closest positive and Integer
        for (int i = 0; i < a.length; i++) {
            if (a[i]<0 && a[i+1]>0) {
                temp = a[i+1];
            }
        }
        return temp;
    }


}
