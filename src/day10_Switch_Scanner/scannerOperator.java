package day10_Switch_Scanner;
import java.util.Scanner;
public class scannerOperator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Input your number: ");

        byte num1 = input.nextByte();

        System.out.println("Input your name: ");
        Scanner word=new Scanner(System.in);
        String word1=word.next();

        System.out.println("You number is "+num1+ " "+word1);

        input.close();

    }
}
