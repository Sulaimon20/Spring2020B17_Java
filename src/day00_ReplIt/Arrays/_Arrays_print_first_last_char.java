package day00_ReplIt.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _Arrays_print_first_last_char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String first, last;
        for (int i = 0; i<5; i++){
            first=words[i].substring(0,1);
            last=words[i].substring(words[i].length()-1);
            words[i]=first+""+last;
        }
        System.out.println(Arrays.toString(words));

//        Arrays.toString(words);
  //      System.out.println(words);
    //    for(String each:words){
      //      System.out.println(""+each.charAt(0)+each.charAt(each.length()-1));       }


        }
}

