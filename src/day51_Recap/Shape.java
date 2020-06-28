package day51_Recap;

public abstract class Shape {
    public String name;
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
interface Volume{

    boolean hasVolume=true;
    double calculateVolume();

}
interface PI{

    double PI=3.14;

}
