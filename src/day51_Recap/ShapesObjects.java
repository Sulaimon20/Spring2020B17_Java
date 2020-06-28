package day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapesObjects {
    public static void main(String[] args) {


        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);
        Cylinder cylinder1 = new Cylinder(2, 3);
        Cylinder cylinder2 = new Cylinder(3, 5);
        Shape cylinder3 = new Cylinder(2, 3);

        System.out.println(((Cylinder)cylinder3).calculateVolume());

        ArrayList<Shape> list = new ArrayList<>();
        list.addAll(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

        Shape shape1=circle1; //    implicitly upcasting
        Shape shape2=new Cylinder(3,6);//upcasting


        ((Cylinder) shape2).calculateVolume();

        for (Shape eachShape: list) {
            System.out.println(eachShape.name +" : "+eachShape.calculateArea());
        }
        double d=((Cylinder)list.get(2)).calculateVolume();//reference type is Shape, shape does not have
        System.out.println(d);
        ((Cylinder)list.get(1)).calculateVolume();//is A relation
        //circle cannot be reference by cylinder

        Shape s1=new Circle(6);
        //System.out.println(s1.radius);
        Circle c1=(Circle) s1;


    }
}
