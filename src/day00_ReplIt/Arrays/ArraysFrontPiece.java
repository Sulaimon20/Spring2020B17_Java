package day00_ReplIt.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
          num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[]  numArr=new int [2];

        if (num.length<2) {
            System.out.println(Arrays.toString(num));
         } else {
            numArr [0]=num[0];
            numArr [1]=num[1];
            System.out.println(Arrays.toString(numArr));
        }



        }
    }

/*
Given an int array of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

Example:
input 1, 2, 3
output: [1, 2]

Example:
input 1,
output: [1]
 */
