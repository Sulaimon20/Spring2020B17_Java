package OfficeHours._06_03_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Array {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4));

        System.out.println(sum(a));
        System.out.println(Arrays.toString(reverse(a)));
        System.out.println(sum(list));
        System.out.println(reverse2(list));

    }

    public static int sum(int [] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }

        return sum;
    }
    public static int sum(ArrayList<Integer> list){
        int sum=0;
        for (int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }

    public static int [] reverse(int [] a){

        for (int i = 0; i <a.length/2 ; i++) {
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }

        return a;
    }

    public static ArrayList<Integer> reverse2(ArrayList<Integer> list){
        ArrayList<Integer>temp=new ArrayList<>();
        for (int i = list.size()-1; i >=0 ; i--) {
            temp.add(list.get(i));
        }
        return temp;
    }

}
