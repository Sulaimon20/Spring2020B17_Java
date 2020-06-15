package day00_Re_Studying.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));
    }

    public static int [] reverse(int [] a){

        for (int i = 0; i <a.length/2 ; i++) {
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        return a;
    }



}
