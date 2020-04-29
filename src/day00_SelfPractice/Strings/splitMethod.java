package day00_SelfPractice.Strings;

import java.util.Arrays;

public class splitMethod {
    public static void main(String[] args) {
        String word = "How are you doing today?";
        var word1 = word.split("");
        System.out.println(Arrays.toString(word1));//[H, o, w,  , a, r, e,  , y, o, u,  , d, o, i, n, g,  , t, o, d, a, y, ?]
        var word2 = word.split("", 3);
        System.out.println(Arrays.toString(word2));//[H, o, w are you doing today?]




    }
}
