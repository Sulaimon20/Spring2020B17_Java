package OfficeHours._4_15_Arrays;

import java.util.Arrays;

public class SplitMethodArray {
    public static void main(String[] args) {
        String sentence="I like to learn java";
        String [] word=sentence.split(" ");
        System.out.println(Arrays.toString(word));//[I, like, to, learn, java]
        int totalWord=word.length;
        System.out.println(totalWord);//5

        for (int i=word.length-1; i>=0; i--){
            System.out.print(word[i]+" ");//java learn to like I
        }

    }
}
