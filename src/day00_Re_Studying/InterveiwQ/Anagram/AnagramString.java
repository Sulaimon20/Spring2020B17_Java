package day00_Re_Studying.InterveiwQ.Anagram;

import java.util.Arrays;

public class AnagramString {


        public static void main(String[] args) {

           // System.out.println(("java", "cava"));
            String word1="creative";
            String word2="reactive";
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();
            char w1[] = word1.toCharArray();//creative
            char w2[] = word2.toCharArray();//reactive

            Arrays.sort(w1);//aceeirtv
            Arrays.sort(w2);//aceeirtv
            System.out.println(w2);
            if (Arrays.equals(w1, w2)) {
                System.out.println("Anagram");;
            } else {
                System.out.println("Not anagram");;
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

