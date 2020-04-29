package day22_Arras_Loops;

import java.util.Arrays;

public class warmUpArrays {
    public static void main(String[] args) {

//      foreach loop method
        int[] arr1 = new int[1000];// index 0~99,
        // there is only 0 in each index
//Step 2
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;}
        System.out.println(Arrays.toString(arr1));//[1,2,3,4,5...100]
//Step 3
        for (int each : arr1) {
            // 1,2,3,4,5,6,7,8...100
            if (each % 2 != 0) {
            // we print only even numbers
                    continue;
                }
                System.out.print(each+" ");
            }
        }
    }

/*
int[] arr = new int[100];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
            if (arr[a] % 2 != 0) {
                continue;
            }
            System.out.println(arr[a]);
        }
 */