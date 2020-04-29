package day00_ReplIt.Arrays;

import java.util.Scanner;

public class _099_Count_triples_Loop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        //WRITE YOUR CODE HERE
        for (int i=0; i<=str.length()-3; i++){
            if (str.charAt(i) == str.charAt(i+1)  &&  str.charAt(i) == str.charAt(i+2)) {
            count++; }
        }
        System.out.println(count);
    }
}