package day00_ReplIt.Arrays;

import java.util.Scanner;

public class _109_ArraysPrintingLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below
        //Example:
        //arr -> ["apple", "banana"]
        // prints: app
        //         ban
        for (int i = 0; i < 5; i++) {
            arr[i] = arr[i].substring(0, 3);
            System.out.println(arr[i]);
        }

    }
}
