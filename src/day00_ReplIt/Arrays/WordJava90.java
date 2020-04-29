package day00_ReplIt.Arrays;

import java.util.Scanner;

public class WordJava90 {
    public static void main(String[] args) {

    Scanner scan= new Scanner(System.in);
    String word = scan.next();//javaxjavaapplepearjavaegg
        //                      0123456.................25
    int count=0;

    for (int i=0; i<=word.length()-1; i++){//       1) we count the word length rom the last letter
        if (word.contains("java")){//               2) we look if the word contains "java"
            word=word.replaceFirst("java","");//  3) we
            count++;//                              3)we count how many times this java repeats
        }
         }System.out.println(count);

    }
}
