package day22_Arras_Loops;

import java.util.Arrays;

public class nestedForEachArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        //          0 1 2 3 4
        for (int each : arr){
            System.out.print(each+" ");
        }

        int [][] arr2D={ {1,2,3}, {4,5,6} };

        for (int [] each1Darray : arr2D ){
            for ( int eachElement: each1Darray) {
                System.out.print(eachElement+" ");//1,2,3,4,5,6
            }
            }
        System.out.println("=====================");

        char [][] ch2D={ {'A', 'B' }, {'C','D','E'}};
        for (char [] each1DArray : ch2D){
            for (char eachElement : each1DArray){
            System.out.print(eachElement+" ");
        }
        }

        }
    }

