package day00_ReplIt;

import java.util.Scanner;

public class _069_Print_halfOfTheWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String word1= word.substring(0,word.length()/2);
        System.out.print(word1+word1);

    }
}
