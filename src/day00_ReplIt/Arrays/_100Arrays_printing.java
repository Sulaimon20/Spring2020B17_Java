package day00_ReplIt.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class _100Arrays_printing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                String [] arr = new String[5];
                for (int i=0;i<5;i++)
                {
                    arr[i] = input.nextLine();
                }
                //leave above alone!  write your code below.
                //Create another loop for your solution!
        for (int i=0; i<=arr.length-1; i++) {

            System.out.println(arr[i]);
        }
    }
}
