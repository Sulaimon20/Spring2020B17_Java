package day00_Re_Studying.InterveiwQ.Anagram;

import OfficeHours._06_03_Array.Array;

import java.util.Arrays;

public class AnagramString {
        public static void main(String[] args) {

        test("silent", "listen");
        }

        public static void test(String a, String b){

                a.toLowerCase();
                b.toLowerCase();

                char[] ch=a.toCharArray();
                char[] ch2=b.toCharArray();

                Arrays.sort(ch);
                Arrays.sort(ch2);

                if (Arrays.equals(ch,ch2)){
                        System.out.println(" anagram ");
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

