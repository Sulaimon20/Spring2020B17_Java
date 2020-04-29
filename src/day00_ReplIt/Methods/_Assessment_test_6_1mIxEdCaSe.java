package day00_ReplIt.Methods;

import java.util.Scanner;

public class _Assessment_test_6_1mIxEdCaSe {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        s=s.toLowerCase();//we need first make the letter the same to lower case
        String result ="";
        for (int i=0; i<s.length(); i++){// we start counting the letters
            if (i%2!=0){//we divide the index of the word by even and odd
                result+=s.substring(i, i+1).toUpperCase();//all the odd letters gonna be in Upper case
                continue;
            }
            result+=s.substring(i,i+1);//we store them
        }
        System.out.println(s);//     powerful
        //                           01234567
        System.out.println(result);//pOwErFuL

    }
}
