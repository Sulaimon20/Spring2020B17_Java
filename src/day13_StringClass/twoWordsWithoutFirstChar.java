package day13_StringClass;

import java.util.Scanner;

public class twoWordsWithoutFirstChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input two words");
        String word1=input.nextLine();
        String word2=input.nextLine();

         String word3=word1.substring(1);
        String word4=word2.substring(1);

        System.out.println(word3.concat(word4));


    }

}
/*
Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    elephant
                Output:
                    The middle character in the string: ph
Collapse



:+1:
2


 */