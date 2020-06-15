package day00_Re_Studying.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMaxLenString {
    public static void main(String[] args) {

       ArrayList< String>str=new ArrayList<>(Arrays.asList("Mile", "Tom", "Rim", "William"));


       System.out.println(maxLenString(str));
    String str2="I like java";
    String str3="";
        for (int i = str2.length()-1; i >=0 ; i--) {
            str3+=str2.charAt(i);
        }
        System.out.println(str3);



    }
    public static String maxLenString(ArrayList<String> str){
        String maxLenString="";
        for (String word:str) {
            if (word.length()>maxLenString.length()){
                maxLenString=word;
            }
        }
        return maxLenString;

    }
}
