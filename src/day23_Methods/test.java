package day23_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static day23_Methods.Methods.printHello5Times;

public class test {
    public static void main(String[] args) {

        String word="abc123&!%#";
        String let="";
        String num="";
        String spec="";

        for (int i=0; i<word.length();i++){

            char ch=word.charAt(i);
            if (ch>61&&ch<122){
                let+=ch;
            }else if(ch>30&&ch<39){
                num+=ch;
            }else {
                spec+=ch;
            }

        }
        System.out.println(let+" "+num+" "+spec);


        ArrayList<String>list=new ArrayList<>(Arrays.asList(word));




        printHello5Times();
        int [] arr={1,2,3,4,5,6,5};
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


        String x="java";

        System.out.println();
        reverse(x);



    }

     public static String reverse(String x) {
        String name="";
        for (int i = x.length() - 1; i >= 0; i--) {
            name+=x.charAt(i);
        }
        return name;
    }

}
