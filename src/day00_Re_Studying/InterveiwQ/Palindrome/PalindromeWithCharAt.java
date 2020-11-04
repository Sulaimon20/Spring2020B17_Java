package day00_Re_Studying.InterveiwQ.Palindrome;

import java.util.Scanner;

public class PalindromeWithCharAt {
    public static void main(String[] args) {
        String word="anna";
                                        //0123
        String reverseWord="";//avaJ
        for (int i=word.length()-1; i>=0; i--) {
            reverseWord+=word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverseWord)){
                System.out.println("This word is Palindrome: " +reverseWord);
        }else{
            System.out.println("This word is not Palindrome: "+reverseWord);
        }
    }
}
