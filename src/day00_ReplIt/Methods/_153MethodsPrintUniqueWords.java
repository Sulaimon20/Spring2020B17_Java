package day00_ReplIt.Methods;

import java.util.Arrays;

public class _153MethodsPrintUniqueWords {
    public static void main(String[] args) {

    String[] words = {"java", "code", "python", "code"," rust", "code"," rust"};
        printUniqueWords(words);
    }
    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        String result="";
        for (int j=0; j<words.length; j++) {
            int count = 0;
            for (int i = 0; i < words[i].length(); i++) {
                if (words[i].equals(words[j])) {
                    count++;//
                }
            }
            if (count==1) {
                System.out.println(words[j]);

            }
        }

    }
}
