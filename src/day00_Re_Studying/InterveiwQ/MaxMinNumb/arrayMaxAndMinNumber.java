package day00_Re_Studying.InterveiwQ.MaxMinNumb;

public class arrayMaxAndMinNumber {
    public static void main(String[] args) {

        int numbers [] = {5, -12, 4, 56, 3, -12, 9, -1};
        // assign first array element to two variables
        int max =numbers [0];
        int min = numbers [0];
        // iterate and compare from array index 1
        for(int i = 1; i < numbers .length; i++){
            if(max < numbers [i]){
                max = numbers [i];
            }else if(min > numbers [i]){
                min = numbers [i];
            }
        }
        System.out.println("Maximum number = "
                + max + " Minimum number = " + min);

    }
}

