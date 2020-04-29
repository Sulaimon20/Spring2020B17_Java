package day00_ReplIt.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _ArraysConvert_binaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }
        //TODO: Write your code below.
        int decimal=0, k=1, rem;
        int eachNum=0;
        for (int i = 0; i < binary.length; ++i) {
             eachNum=binary[i];
            while (eachNum != 0)
            {
                rem = eachNum%10;
                decimal = decimal + rem*k;
                k = k*2;
                eachNum = eachNum/10;
            }
        }
        System.out.print(decimal);
    }

}
