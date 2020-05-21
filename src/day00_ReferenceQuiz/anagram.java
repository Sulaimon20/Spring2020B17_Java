package day00_ReferenceQuiz;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {

        String str1="reactive";
        //           chars

        String str2="creative";

        // we have to convert them to char Array
        char[] ch1=str1.toCharArray();
        char [] ch2=str2.toCharArray();

        // we need to sort them
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //we use Array equils
        Arrays.equals(ch1,ch2);

        System.out.println(Arrays.equals(ch1,ch2));


        int a=1;//1,2,3,4,5
        int b=5;

        for (int i=1; i<=5; i++){
             a=a*i;
        }
        System.out.println(a);














    }

}
