package day00_Re_Studying.InterveiwQ.DescendingOrder;

import java.util.Arrays;

public class CharArrayDescendingCharOverMeth {
    public static void main(String[] args) {
        char [] ch={'F','B','C','H','D','A','G','J'};
        System.out.println("Original order: "+Arrays.toString(ch));
        char [] ch2=descendingChar(ch);
        System.out.println("Ascending order "+Arrays.toString(ch2));

        String str=extractChar(ch);
        System.out.println(str);


    }
    public static char[] descendingChar(char[] ch){
        Arrays.sort(ch);
        return ch;
    }
    public static String extractChar(char[]ch){
        String result ="";
        for (int i=0; i<ch[ch.length]; i++){
            result=ch[i]+"";
        }
        return result;
    }
}
