package day00_ReplIt;

import java.util.Scanner;

public class _062_Print_first_and_last_letters {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE

   System.out.println(word.substring(0,1)+""+word.substring(word.length()-1));
}
}