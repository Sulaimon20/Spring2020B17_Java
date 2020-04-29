package day00_Re_Studying.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysStrings {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
//      from numbers to print
        int [] num=new int [5];
        for(int i=0; i<num.length; i++) {
            num[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(num));//[1, 2, 3, 4, 5]

//      from char to print

        char [] ch=new char[5] ;//we create new arrays for characters
        for(int i=0; i<num.length; i++) {//we create
            ch[i] = scan.next().charAt(0);//input char
        }
        System.out.println(Arrays.toString(ch));//[a, s, d, f, g]

        // from String to arrays
        String [] str=new String[3];//we create new arrays for
        for(int i=0; i<num.length; i++) {//we create
            str[i] = scan.next();//input
        }
        System.out.println(Arrays.toString(str));//[a, s, d, f, g]


    }
}
