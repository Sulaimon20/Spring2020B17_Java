package day35_Static;

public class staticMethods {

        int a=100;
        static int b=200;

    public static void main(String[] args) {
       // System.out.println(a); // compiler error static only accepts
    staticMethods obj=new staticMethods();

        System.out.println(obj.a);
        System.out.println(obj.b);
        staticMethods obj1=new staticMethods();
        obj1.a=10;
        obj1.b=12;
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        staticMethods obj2=new staticMethods();
        System.out.println(obj2.a);//100
        System.out.println(obj2.b);//12

        staticMethods obj3=new staticMethods();
        System.out.println(obj3.a);//100
        System.out.println(obj3.b);//12

        // System.out.println(staticMethods.b);
        //System.out.println(obj.b);



    }

    public void method(){

        System.out.println("instance  "+ a);
        System.out.println("static   "+ b);
    }
}
