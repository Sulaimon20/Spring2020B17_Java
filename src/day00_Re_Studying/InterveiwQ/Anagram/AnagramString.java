package day00_Re_Studying.InterveiwQ.Anagram;

import java.util.Arrays;

public class AnagramString {
        public static void main(String[] args) {
        String word1="Listen";
        String word2="Silent";

        word1=word1.toLowerCase();
        word2=word2.toLowerCase();

        char [] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);

        if (Arrays.equals(w1,w2)){
            System.out.println("Anagram");
        }else {
            System.out.println("not anagram");
        }

        }
    }

/*
isAnagram("listen", "Silent") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("star", "rats") ==> true
isAnagram("hi", "bye") ==> false
isAnagram("java", "cava") ==> false
 */

