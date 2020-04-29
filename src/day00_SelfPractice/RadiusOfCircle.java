package day00_SelfPractice;

import java.util.Scanner;

public class RadiusOfCircle {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.println("Input radius of circle: ");
        double y = radius.nextDouble();
        System.out.println("Perimeter of the circle is:"+(2*3.14*y));
        System.out.println("Area of the circle is "+(3.14*y*y));

    }

}
