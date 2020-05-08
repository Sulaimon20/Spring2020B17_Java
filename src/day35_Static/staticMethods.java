package day35_Static;

public class staticMethods {

        int a=100;
        static int b=200;

    public static void main(String[] args) {
       // System.out.println(a); // compiler error static only accepts
    staticMethods obj=new staticMethods();

        System.out.println(obj.a);
        System.out.println(b);

        System.out.println(staticMethods.b);
        System.out.println(obj.b);



    }

    public void method(){

        System.out.println("instance  "+ a);
        System.out.println("static   "+ b);
    }
}
