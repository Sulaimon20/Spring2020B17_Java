package day01_FirstJavaProgramming;
import java.util.Scanner;
public class KaisarProgrammInput {
            public static void main(String args[]) {
            System.out.println("How old are you?");
            Scanner age = new Scanner(System.in);
            String answer = age.nextLine();
            System.out.println("Nice!");
            System.out.println("You are " + answer);
        }
    }


