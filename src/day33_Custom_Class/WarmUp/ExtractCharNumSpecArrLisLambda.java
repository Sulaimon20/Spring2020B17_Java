package day33_Custom_Class.WarmUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExtractCharNumSpecArrLisLambda {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char [] arr=str.toCharArray();
        Character[] ch= new Character[arr.length];
        for (int i=0; i<arr.length; i++){
            ch[i]=arr[1];
        }
        System.out.println(Arrays.toString(ch));
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList(ch));
        chars.removeIf(p-> !Character.isLetter(p));
        System.out.println(chars);


        ArrayList<Character> nums = new ArrayList<>(Arrays.asList(ch));

        nums.removeIf(p-> !Character.isDigit(p));
        System.out.println(nums);

        ArrayList<Character> specialChar = new ArrayList<>(Arrays.asList(ch));
        specialChar.removeIf(p-> !Character.isDigit(p)&&!Character.isLetter(p));
        System.out.println(specialChar);





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