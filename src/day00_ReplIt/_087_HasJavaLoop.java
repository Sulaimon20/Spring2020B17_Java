package day00_ReplIt;

import java.util.Scanner;

public class _087_HasJavaLoop {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.indexOf("java", 0)==0 || word.indexOf("java", 1)==1) {
            exists = true;
        }
        System.out.println(exists);


        System.out.println(word.indexOf("java", 0));
        System.out.println(word.indexOf("java",1));
    }
    }

