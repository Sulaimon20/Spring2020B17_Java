package day18_DoWhileNestedLoop;

public class nestedForLoopPractice {
    public static void main(String[] args) {



        for (int i = 9; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
            System.out.println("==========================");

        for (char z='a'; z<='e'; z++){

            for (char ch='a'; ch<=z; ch++){
                System.out.print(ch+"");
            }
            System.out.println();
        }

        }
    }

