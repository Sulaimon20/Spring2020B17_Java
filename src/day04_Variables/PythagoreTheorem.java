package day04_Variables;
import java.util.Scanner;
public class PythagoreTheorem {
    public static void main(String[] args) {
        // A2+B2=C2         C=SCVR(A2+B2)
        System.out.println("        Pythagorean Theorem");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the value for side A of triangle: ");
        double a = scanner.nextDouble();

        System.out.println("Insert the value for side B of triangle: ");
        double b = scanner.nextDouble();

        double value1 = (Math.pow(a, 2) + Math.pow(b, 2));
        double value = (Math.sqrt(value1));

        System.out.println("The side C of triangle is equal to " + value);

           }
        }
