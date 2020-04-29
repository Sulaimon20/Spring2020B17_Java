package day21_MultiDimensionalArray;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
        //                 1            2       3       4
        int x = planets.length;
        int y = planets[1].length();
        System.out.println(x + " " + y);
        //                 4   1+4=5

        String str = "I like Java";
        System.out.println(str+"\n");


        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));//[I, like, Java]
        /// reverse sentence; day great is today

        String sentence = "Today is great day";
        String[] word = sentence.split(" ");
        String result = "";
        System.out.println(Arrays.toString(word)); //[Today, is, great, day]
        for (int i = word.length - 1; i >= 0; i--) {
            String eachWord = word[i];
            result += eachWord + " ";
        }
        System.out.print(result);

        String str2 = "ABCD";

        String arr2[] = str2.split(""); // ["A", "B", "C", "D"]


        System.out.println("\n" + Arrays.toString(arr2)); //[A, B, C, D] <== these are Strings, not char

    }}