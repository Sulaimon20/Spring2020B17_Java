package day00_ReplIt.Arrays;

import java.util.Arrays;

public class FindtheMissingNumber {

    public static void main(String[] args) {
    int[] a={7, 10, 3, 6, 5, 9, 1, 4, 8};
           //  0  1  2  3  4  5  6  7  8

        Arrays.sort(a);
        System.out.println(missingNumber(a));
    }
    public static int missingNumber(int[] arr){
        int n=9;
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= arr[i];
        return total;

    }
}
