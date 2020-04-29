package day00_ReplIt;

import java.util.Scanner;

public class _064_Middle_One_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if (word.length() % 2 != 0 && word.length() > 1) {
            String middle1 = word.substring(word.length() / 2, word.length() / 2 + 1);
            System.out.println(middle1);}
            if (word.length() == 1) {
                System.out.println(word + "" + word + "" + word);
            }
            if (word.length() % 2 == 0 && word.length() > 2) {
                String middle2 = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
                System.out.println(middle2);
            }
            if (word.length() == 2) {
                System.out.println(word + "" + word);
            }

    }
}









//if (word.length()-1 == 1) {
//                System.out.println(word +word + word);