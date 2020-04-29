package day00_ReplIt.Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _195MethodsWithStringAnagram {
    public static boolean isAnagram(String word1, String word2) {
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        char w1[] = word1.toCharArray();
        char w2[] = word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        if(Arrays.equals(w1, w2)){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(isAnagram("java", "cava"));
    }
}
/*
isAnagram("listen", "Silent") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("star", "rats") ==> true
isAnagram("hi", "bye") ==> false
isAnagram("java", "cava") ==> false
 */