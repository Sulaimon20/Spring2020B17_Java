package day00_ReplIt.Methods;

import java.util.Scanner;

public class _AssessmentTest_5_1PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for(int i = 0; i < word.length(); i++){
            char j = Character.toLowerCase(word.charAt(i));
            if (j == 'a' || j == 'e'|| j == 'i' || j == 'o' || j == 'u'){
                System.out.print(word.charAt(i));
            }

        }

    }
}
/*
Write a for loop that will loop through every letter of the input and print
out just the vowels. Sample input/outputs
HINT:  vowel is a letter representing a vowel sound, such as a, e, i, o, u.
 */