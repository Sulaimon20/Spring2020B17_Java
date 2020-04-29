package day12_JavaRecap.WarmUp;

import java.util.Scanner;

public class ScannerAreaOfTriangel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("To define the area of circle enter the value of its radius:");
        int radius= input.nextInt();
        double pi=3.14159265359;
        double areaOfCircle=pi*(Math.pow(radius, 2));
        System.out.println("The area of circle is: "+areaOfCircle);
        input.close();
    }
}
