package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;
//    Create a class called Circle
public class Circle {
    /*
            instance variables:
                    radius, pi, diameter
                  perimeter: diameter * PI
     */

    static double PI = 3.14;
    double radius;
    double diameter;
//add a constructor that can initialize the radius of the circle
    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }
//          instance methods:
//  area(): can return the area of the circle as double

    public double area(){
        return PI * radius * radius;
    }

    // perimeter(): cna return the perimeter of the circle as double
    public double perimeter(){
        return diameter * PI;
    }

    //  toString(): returns the info of the circle

    public String toString(){
        return "Circles radius: "+radius+
                ", Circles diameter: "+diameter+
                ", Circles area: "+area()+
                ", Circles perimeter: "+perimeter();
    }


/*
Task03:
    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */


}
