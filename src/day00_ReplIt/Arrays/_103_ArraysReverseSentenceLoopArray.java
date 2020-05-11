package day00_ReplIt.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _103_ArraysReverseSentenceLoopArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversed = "";

        String[] words = sentence.split(" ");//[Java, is, fun]
        Arrays.toString(words);//[Java, is, fun]
        for(int i = words.length-1;  i >= 0; i-- ){//
            String each =  words[i];
            reversed += " " + each;
           reversed=reversed.trim();//this is remove the extra space before the word
        }


        System.out.println(reversed);



    }
}
