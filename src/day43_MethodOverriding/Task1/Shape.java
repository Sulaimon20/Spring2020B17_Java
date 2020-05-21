package day43_MethodOverriding.Task1;


public class Shape {
    //static double PI = 3.14;
    public double area;
    public double perimeter;
    //double radius;
    //double diameter;


    public void calculateArea(){
        area=0;
        System.out.println("Area of the shape: " +area);

    }
    public void calculatePerimeter(){
        perimeter=0;
        System.out.println("Perimeter of the shape is "+perimeter);
    }


}
