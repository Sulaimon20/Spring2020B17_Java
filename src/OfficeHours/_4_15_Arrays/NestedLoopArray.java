package OfficeHours._4_15_Arrays;

import java.util.Arrays;

public class NestedLoopArray {
    public static void main(String[] args) {
        int [][] numbers={ {5,4,3,2,1}, {14,15,12,13,10,11}, {16,20,18,19,17} };
        Arrays.sort(numbers[0]);
        Arrays.sort(numbers[1]);
        Arrays.sort(numbers[2]);
        String str="";
        System.out.println();
        for (int j=0; j<numbers.length; j++){
            for (int i=0; i<numbers[j].length; i++){
                if (numbers[j][i]%2==0){
                    continue;
                    }
                str =numbers[j][i]+", ";
            }
            System.out.println(str.trim());
        }
        System.out.println();

        for (int [] each: numbers){
            for (int eachElement: each){
                if(eachElement%2==0){
                    continue;
                }
                System.out.println(eachElement);
            }
        }
    }
}
