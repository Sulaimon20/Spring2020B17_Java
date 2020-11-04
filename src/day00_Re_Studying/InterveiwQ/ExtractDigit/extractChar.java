package day00_Re_Studying.InterveiwQ.ExtractDigit;

import java.util.ArrayList;

public class extractChar {
    public static void main(String[] args) {
        String str= "ABCD123$%#@&456EFG!";
            char [] arr=str.toCharArray();

        ArrayList<Character> letter=new ArrayList<>();
        ArrayList<Character> digits=new ArrayList<>();
        ArrayList<Character> specialChar=new ArrayList<>();

        for (char each: arr) {
            if (Character.isAlphabetic(each)) {
                letter.add(each);
            } else if (Character.isDigit(each)) {
                digits.add(each);
            }
            else  {//(!Character.isDigit(each)&&!Character.isDigit(each))
                specialChar.add(each);
            }

        }
        System.out.println(letter);//[A, B, C, D, E, F, G]
        System.out.println(digits);//[1, 2, 3, 4, 5, 6]
        System.out.println(specialChar);//[$, %, #, @, &, !]


    }
}
