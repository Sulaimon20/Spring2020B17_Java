package day00_SelfPractice;
import java.util.Scanner;
public class countTheRemainder {

    public static void main(String[] args) {
        int number1, number2, result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 and number2 respectively: ");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        result = number1 % number2;
        System.out.print(result);

    }
}
