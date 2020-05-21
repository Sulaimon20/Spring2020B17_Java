package day43_MethodOverriding.Task1;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1=new Circle(3);
        System.out.println("\t\tCircle");
        System.out.println("Circle radius is "+circle1.radius);

        circle1.calculateArea();//28.26
        circle1.calculatePerimeter();//18.26

        System.out.println("============================");

        Rectangle rectangle1=new Rectangle(3,2);
        System.out.println("\t\tRectangle");
        System.out.println("Given length of Rectangle is "+rectangle1.length);
        System.out.println("Given width of Rectangle is "+rectangle1.width);
        rectangle1.calculateArea();//
        rectangle1.calculatePerimeter();//
        System.out.println("=============================");


        System.out.println("\t\tSquare");
        Square square1=new Square(3);
        System.out.println("Side of square: "+square1.side);
        square1.calculateArea();
        square1.calculatePerimeter();


    }
}
