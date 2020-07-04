package day00_Re_Studying;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingNumbers {
    public static void main(String[] args) {
        int [] arr={1,2,6,9,10,14};
        ArrayList<int []> a=missingNumbers(arr);
       // System.out.println(Arrays.toString(a));
    }
    public static ArrayList<int[]> missingNumbers(int [] num){
        ArrayList<int[]> list=new ArrayList<>();

        for (int i = 0; i <num.length ; i++) {
            if (!list.contains(num)){
                list.addAll(Arrays.asList(num));
            }

        }
        return list;

    }
}
