package day00_ReplIt;

import java.util.Scanner;

public class _066_Merge_them {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
         char ch,ch2,ch3,ch4,ch5,ch6;
         if (word1.length()==3&&word2.length()==3){
             ch=word1.charAt(0);
             ch2=word1.charAt(1);
             ch3=word1.charAt(2);

             ch4=word2.charAt(0);
             ch5=word2.charAt(1);
             ch6=word2.charAt(2);

             System.out.print(ch+""+ch4+""+ch2+""+ch5+""+ch3+""+ch6);

         }else{
            System.out.println("cannot merge");
        }

        }
}
/*

 */