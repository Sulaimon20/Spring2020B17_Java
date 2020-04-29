package day10_Switch_Scanner;
import java.util.Scanner;
public class scanner_MediumNumberTernery {

            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input your first number: ");
            int num1= input.nextInt();
            Scanner input2 = new Scanner(System.in);
            System.out.println("Input your second number: ");
            int num2= input.nextInt();
            Scanner input3 = new Scanner(System.in);
            System.out.println("Input your third number: ");
            int num3= input.nextInt();

           int medium=(num1>num2&&num1<num2) ?num1: (num2>num1&&num2<num3)? num2: num3;
            System.out.println("The medium number is "+num1);
            System.out.println("The medium number is "+num2);
            System.out.println("The medium number is "+num3);

            System.out.println("The average of the numbers is: "+(num1+num2+num3/3));
                input.close();
    }



}
