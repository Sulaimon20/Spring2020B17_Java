package day00_SelfPractice;

import java.util.Scanner;

public class numberCharacterInWord {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter characters");
        String word=input.next();

        String result="";
        int letter=0;

        while (letter <= word.length() - 1) {//letter is smaller a whole word
            int count = 0;
            if (result.contains(""+word.charAt(letter))){
                letter++;
                continue;}

            for (int i = 0; i <= word.length() - 1; i++) {
                if (word.charAt(i) ==word.charAt(letter)){
                    count++;
                }
            }
            result+=word.charAt(letter);
            System.out.print(word.charAt(letter)+""+count);
            letter++;  }

    }
}
