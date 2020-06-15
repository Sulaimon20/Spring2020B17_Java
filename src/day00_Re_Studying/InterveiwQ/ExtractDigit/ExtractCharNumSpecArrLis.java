package day00_Re_Studying.InterveiwQ.ExtractDigit;

import java.util.ArrayList;

public class ExtractCharNumSpecArrLis {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> nums = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Character> specials = new ArrayList<>();

       for (int i=0; i<str.length();i++){
           if (Character.isDigit(str.charAt(i))){
               nums.add(str.charAt(i));
           }
           if (Character.isAlphabetic(str.charAt(i))){
               chars.add(str.charAt(i));
           }
           else {
               specials.add(str.charAt(i));
           }
       }
        System.out.println(nums);
        System.out.println(chars);
        System.out.println(specials);


    }
}
/*
write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
 */