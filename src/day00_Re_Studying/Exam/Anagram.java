package day00_Re_Studying.Exam;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String one="listen";
        String two="silent";
        System.out.println(isAnagram(one,two));
    }
public static boolean isAnagram(String one, String two){

    if (one.length()!=two.length()) return false;
    int [] count=new int [26];

    for (int i=0; i<one.length();i++){
       // count[0]=count[0]+1;
        char c=one.charAt(i);//l
        char d=two.charAt(i);//l

        count[c-97]=count[c-97]+1;
        count[c-97]=count[c-97]-1;
    }
    return Arrays.equals(count, new int[26]);
}
}
