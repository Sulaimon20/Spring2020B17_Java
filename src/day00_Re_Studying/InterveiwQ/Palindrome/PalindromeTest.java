package day00_Re_Studying.InterveiwQ.Palindrome;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word:");
        String word=input.nextLine();   //JAVA
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
