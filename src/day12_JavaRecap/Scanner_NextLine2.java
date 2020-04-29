package day12_JavaRecap;
// how to remove from memory the enter
import java.util.Scanner;

public class Scanner_NextLine2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int num=input.nextInt();
        System.out.println(num);
        input.nextLine();//this string going to remove enter from compiler memory.

        System.out.println("Enter your name: ");
        String name = input.nextLine();
input.close();
}
}
