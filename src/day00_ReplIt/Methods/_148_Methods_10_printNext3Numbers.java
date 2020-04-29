package day00_ReplIt.Methods;

import java.util.Scanner;

public class _148_Methods_10_printNext3Numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
       System.out.print("enter number");
       int num = inp.nextInt();

       next3(num);

    }


    public static void next3(int num) {
        for (int i = 2; i <= 4; i++) {
            num++;
            System.out.print(num + " ");

        }

    }
}
