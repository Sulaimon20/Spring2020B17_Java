package day19_Arrays.day19_WarmUp;

import java.util.Scanner;

public class countOfCharinSentence {
    public static void main(String[] args) {
        /* write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"  */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the word");
        String str = input.next();
        String result = "";
       for (int j=0; j<=str.length()-1;j++){

           char ch2=str.charAt(j);
           int count =0;//to count the occurence of the character
           for (int i=0; i<=str.length()-1; i++){ //i==index of the character, starts from index 0 and ends with length
               char ch=str.charAt(i);
               if (ch=='B'){ // if the A unique or not
                   count++; // count will be increase
               }
               if (count==1){
                   result+=ch2;
               }
           }
           System.out.println(result);
       }


    }
}
