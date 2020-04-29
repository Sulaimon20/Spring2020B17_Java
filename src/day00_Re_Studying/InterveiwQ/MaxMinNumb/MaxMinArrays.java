package day00_Re_Studying.InterveiwQ.MaxMinNumb;

public class MaxMinArrays {
    public static void main(String[] args) {
        int [] numbers={2,3,4,5,7,8,1999, -2, 9,0,1};// we need to know the length of the array
        int lastIndex=numbers.length-1;
        int max=numbers[0];//2
        int min=numbers[0];
        for (int i=0; i<=lastIndex; i++){
            if (numbers[i]>max){ // maximum
                max=numbers[i];//
            }if (numbers[i]<min) {// minimun
                min=numbers[1];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }
}
