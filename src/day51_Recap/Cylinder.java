package day51_Recap;

public class Cylinder extends Shape implements Volume, PI {
    public double radius;
    public int height;

    Cylinder(int height, double radius){
        this.height=height;
        this.radius=radius;
    }
     {
        name="Cylinder";

    }
    @Override
    public double calculateArea() {
        return (PI * 2 * radius * radius) + (height * PI * 2 * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2*(PI*2*radius+height);
    }

    @Override
    public double calculateVolume() {
        return PI*radius*radius*height;
    }
}
