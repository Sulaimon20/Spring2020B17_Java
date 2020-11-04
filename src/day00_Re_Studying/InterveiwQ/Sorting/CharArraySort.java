package day00_Re_Studying.InterveiwQ.Sorting;

import java.util.Arrays;

public class CharArraySort {
    public static void main(String[] args) {
        char [] ch={'F','B','C','H','D','A','G','J'};
        System.out.println("Original order: "+Arrays.toString(ch));
        char [] ch2=descendingChar(ch);
        System.out.println("Ascending order "+Arrays.toString(ch2));



    }
    public static char[] descendingChar(char[] ch){
        Arrays.sort(ch);
        return ch;
    }

}
