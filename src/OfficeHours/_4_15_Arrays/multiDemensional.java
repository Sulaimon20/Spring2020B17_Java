package OfficeHours._4_15_Arrays;

import java.util.Arrays;

public class multiDemensional {
    public static void main(String[] args) {
        //                0 1 2   0 1 2 3
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}};
        //   0 1             0       1
        System.out.println(arr2D[1]);// HASHCODE
        System.out.println(Arrays.toString(arr2D[1]));//[4, 5, 6, 7]
        System.out.println(arr2D[1][3]);//7
        System.out.println(arr2D[1][0]);//4



        String[][] words = {
                {"word1", "word2", "word3"},
                {"word4", "word5", "word6"},
                {"word7", "word8", "word9"},
                 };

        for (int x=0; x<words.length;x++){
            for (int y=0; y<words[x].length;y++){
                System.out.println(words[x][y]+" ");//word1 word2 word3 word4 word5 word6 word7 word8 word9
            }
        }


    }

    }

