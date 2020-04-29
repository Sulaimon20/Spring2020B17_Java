package day00_ReplIt.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _106_Arrays_SplitSentence_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String[] word = sentence.split(" ");
        for (String each : word){
            System.out.println(each);
        }


    }
}
