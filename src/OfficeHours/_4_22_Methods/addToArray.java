package OfficeHours._4_22_Methods;

import java.util.Arrays;

public class addToArray {
    public static void main(String[] args) {

        int [] r={1,5,77,8};
        int n=2;

        add_to_r(r,n);
    }
    public static void add_to_r(int[] r,int n)
    {
        int [] arr=new int [r.length-1+n];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(r));//[1, 5, 77, 8]
        for (int i=0; i<r.length; i++){
            arr[i]=r[i];}
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<n; i++){
            arr[r.length]=n;
        }
            System.out.println(Arrays.toString(arr));//[1, 5, 77, 8, 2]






    }
}
