package day00_ReplIt;
import java.util.Scanner;
public class SliceTheImputNumber {
    public static void main(String[] args) {

                //DO NOT CHANGE
                int num, digit1, digit2, digit3, digit4, digit5;
                //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
         num = input.nextInt();
        digit1 = num%10;
        digit2 = (num/10)%10;
        digit3 = (num/100)%10;
        digit4 = (num/1000)%10;
        digit5 = (num/10000)%10;
        System.out.println(digit5);
        System.out.println(digit4);
        System.out.println(digit3);
        System.out.println(digit2);
        System.out.println(digit1);


    }
}
