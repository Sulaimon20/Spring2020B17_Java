package day12_JavaRecap.WarmUp;

import java.util.Scanner;

public class ScannerTwoWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print two words:");
        String word1=input.nextLine();
        String word2=input.nextLine();
        System.out.println(word1+word2);
        input.close();
    }
}
