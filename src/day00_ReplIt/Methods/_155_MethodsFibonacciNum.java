package day00_ReplIt.Methods;

import java.util.Scanner;

public class _155_MethodsFibonacciNum {
            public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            fib(num);

        }

        public static void fib(int num){
            //WRITE YOUR CODE HERE

            if (num<=1){
                System.out.println(num);
            }
            System.out.println((num-1)+(num-2));
        }
    }

