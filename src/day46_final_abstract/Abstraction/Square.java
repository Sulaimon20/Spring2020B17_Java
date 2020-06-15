package day46_final_abstract.Abstraction;

public class Square extends Shape {
    public double side;


    public Square(double side){
        this.side=side;
    }
    @Override
    public void Area() {
    double area=side*side;
        System.out.println("Area of squire is: "+area);
    }

    public void Area1() {
        double area=side*side;
        System.out.println("Area of squire is: "+area);
    }



    }
