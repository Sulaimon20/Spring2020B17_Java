package day46_final_abstract.Abstraction;

 public final class Circle extends Shape {

     public double radius;
     public final double PI =3.14;

     @Override
     public void Area() {
        double area=radius*radius*PI;
         System.out.println("Area is: "+area);
     }

     public Circle(double radius){
this.radius=radius;
     }


 }
