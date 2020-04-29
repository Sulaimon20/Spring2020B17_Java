package day00_ReplIt.Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class _115_Arrays_Finding_MaxLengthInString {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] words = new String[5];
    for(int i = 0; i <5;  i++) {
        words[i] = input.nextLine();}
    //write your code below
        String largeWord = "";
        int max =0;
        for(int i = 0; i < words.length; i++){
            if( words [i].length() > max){
                max = words[i].length();
                largeWord = words[i];}
        } System.out.println(largeWord);
}
}

/*
 String largest="";
        for (int i=0; i<words.length; i++) {//i=str1, i=str2
            if (i<=words.length-1) {
                largest=words[i];
            }
            System.out.println(largest);
        }
 */