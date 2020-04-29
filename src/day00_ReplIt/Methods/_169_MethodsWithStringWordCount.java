package day00_ReplIt.Methods;

import java.util.Arrays;

public class _169_MethodsWithStringWordCount {
    public static void main(String[] args) {

        String words = "oh no";
        String words2="Banana mama lala";

        int result=wordCount(words);
        System.out.println(result);
        int result2 = wordCount2(words2);
        System.out.println(result2);
    }

    public static int wordCount(String words) {
        String[] word = words.split(" ");
        int count = 0;
         count=word.length ;
        return count;
    }
    public static int wordCount2(String words2) {
        String[] word = words2.split(" ");
       return(word.length);

    }

}
