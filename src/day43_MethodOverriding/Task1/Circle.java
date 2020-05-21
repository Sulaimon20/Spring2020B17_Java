package day43_MethodOverriding.Task1;


public class Circle extends Shape{
    public double radius;
    public static double PI = 3.14;

    //constructor
    public Circle(double radius){
        this.radius=radius;

    }
    //we overide this method
    @Override
    public void calculateArea(){

        area=radius*radius*PI;//functionality

        System.out.println("Area of the circle: " +area);

    }
    @Override
    public void calculatePerimeter(){
        perimeter=PI*2*radius;
        System.out.println("Perimeter of the circle is "+perimeter);
    }



   }
