package day00_SelfPractice;

import java.util.Arrays;

public class className {
    public static void main(String[] args) {


        String str = "silent";
        //
        String str2 = "listen";
        char[] s= str.toCharArray();
        char[] s2= str2.toCharArray();

        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s2));

        Arrays.sort(s);
        Arrays.sort(s2);

        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s2));


        String result="";
        for (int i=0; i<s.length; i++){
            if(s[i]==s2[i]){
                result="anagram";
            }else {
                result="not";
            }
        }
        System.out.println(result);




    }
}
