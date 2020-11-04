package day00_Re_Studying.InterveiwQ.Combain;

import java.util.Arrays;

public class combainStrings {
    public static void main(String[] args) {
        String str="ACEG";
        String str2="BDFH";
        String combainWord="";
//  "ACEG"+"BDFH" ==> "ABCDEFGH"
        int i = 0;
        while (i < str.length() && i < str2.length()) {
            combainWord = combainWord + str.charAt(i) + str2.charAt(i);
            i++;
        }
        combainWord= combainWord + str   .substring(i) + str2.substring(i);
        System.out.println(combainWord);;

    }
}
