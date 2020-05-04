package day00_ReplIt.Methods;

import java.util.Arrays;

public class _153MethodsPrintUniqueWords {
    public static void main(String[] args) {

    String[] words = {"java", "code", "python", "code"," rust", "code"," rust"};
            printUniqueWords(words);
    }
    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for (int i=0; i<words.length; i++) {
            int count = 0;
                for (int k=0; k<words.length; k++){
                    if (words[k].equals(words[i])) {
                        count++;
                    }
                }
                if (count==1){
                    System.out.println(words[i]);
            }
        }



    }
}
