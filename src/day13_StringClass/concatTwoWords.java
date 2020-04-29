package day13_StringClass;

import java.util.Scanner;

public class concatTwoWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input two words");
        String word1=input.nextLine();
        String word2=input.nextLine();
        String w=word1.substring(1, word1.length());//pass the 0 index, print the 1 up to the end
        String w1=word2.substring(1, word2.length());//pass the 0 index, print the 1 up to the end
        System.out.println(w+""+w1);//
    }
}
