package day04_Variables;
import java.util.Scanner;
public class PythagoreTheorem {
    public static void main(String[] args) {
        // A2+B2=C2         C=SCVR(A2+B2)
        System.out.println("        Pythagorean Theorem");
        System.out.println("Insert the value for side A of triangle: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Insert the value for side B of triangle: ");
        Scanner scanner1 = new Scanner(System.in);
        double b = scanner1.nextDouble();
        double value1 = (Math.pow(a, 2) + Math.pow(b, 2));
        double value = (Math.sqrt(value1));
        System.out.println("The side C of triangle is equal to " + value);

           }
        }
