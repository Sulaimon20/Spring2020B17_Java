package day23_Methods;

import javax.sound.sampled.ReverbType;
import java.util.Arrays;

public class MethodsToReverseWord {
    public static void main(String[] args) {

        String name1 = "Muhtar";
        ReverseString(name1);

        String name2 = "Cybertek School";
        ReverseString(name2);

    }

     public static void ReverseString(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i)); //rathuM + //loohcS ketrebyC
        }
        System.out.println();
    }
}