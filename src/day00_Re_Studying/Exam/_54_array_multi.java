package day00_Re_Studying.Exam;

import java.util.Arrays;

public class _54_array_multi {
    public static void main(String[] args) {
        String [][] arr ={{"A", "B", "C"}, {"D","E"}};

        System.out.println(Arrays.deepToString(arr));

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; i++){
                System.out.println(arr[i][j]+"");
            if (arr[i][j].equals("B")){
                break;
            }
            }
            continue;
        }

        String [][] arr1 ={{"A", "B", "C"}, {"D","E"}};

        System.out.println(Arrays.deepToString(arr));

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; i++){
                System.out.println((i)+(j)+"");

                }
            }



    }





    }


