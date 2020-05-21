package day19_Arrays.day19_WarmUp;

import java.util.Arrays;

public class CharArrayDescendingCharOverMeth {
    public static void main(String[] args) {
        char [] ch={'F','B','C','H','D','A','G','J'};
        System.out.println("Original order: "+Arrays.toString(ch));
        Arrays.sort(ch);


        System.out.print("Ascending order "+Arrays.toString(ch));
        System.out.println();
        char [] ch2=descendingChar(ch);
        //  [F, B, C, H, D, A, G, J]
//
        //String str=extractChar(ch);
       // System.out.println(str);//[A, B, C, D, F, G, H, J]


    }
    public static char[] descendingChar(char[] ch){
        Arrays.sort(ch);
        return ch;
    }
    public static String extractChar(char[]ch){
        String result ="";
        for (int i=0; i<ch[ch.length-1]; i++){
            result=ch[i]+"";
        }
        return result;
    }
}
