package day14_StringClass;

import java.util.Scanner;

public class combainTwoStrings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input first words");
        String word1=input.nextLine();
            word1=word1.substring(1);
        System.out.println("Input second words");
        String word2=input.nextLine();
            word2=word2.substring(1);
        System.out.println(word1.concat(word2));
        input.close();
    }
}
