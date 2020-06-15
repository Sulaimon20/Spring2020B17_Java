package day46_final_abstract.Abstraction;

public class Rectangle extends Shape{
    public double base;
    public double height;

    @Override
    public void Area() {
        double area=base*height;
        System.out.println("Area of squire is: "+area);

    }
    public Rectangle(double base, double height){
        this.base=base;
        this.height=height;
    }
}
