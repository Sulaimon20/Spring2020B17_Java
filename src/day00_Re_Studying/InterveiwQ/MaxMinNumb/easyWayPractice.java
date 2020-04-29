package day00_Re_Studying.InterveiwQ.MaxMinNumb;

import java.util.Arrays;

public class easyWayPractice {
    public static void main(String[] args) {
        //method for loop
        int [] num={-12,76,3,6,2345,1};
        int largest=num[0];
        int smolest=num[0];

        for (int i=1; i<num.length;i++){
            if (num[i]>largest){
                largest=num[i];
            }
            else if (num[i]<smolest){
                smolest=num[i];
                }
            }
        System.out.println("1) Method for loop");
        System.out.println("largest number: "+largest);
        System.out.println("smallest number: "+smolest);
        // method sortOf
        System.out.println("2) Method sortOf");
        Arrays.sort(num);
        System.out.println("largest number: "+num[num.length-1]);
        System.out.println("smallest number: "+num[0]);

    }
}
