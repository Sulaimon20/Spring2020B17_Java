package day37_Constructors;

class dog{
    String name;
    int age;
        }
class Test1{
    public static void main(String[] args) {
        Test1 obj=new Test1();
        //System.out.println(obj.name);
    }
}
public class staticReview {
    static int a;// only 1 copy
    int b;      // each object has its own cpoy of instance variable

    public static void main(String[] args) {
        staticReview obj1 = new staticReview();

        obj1.a = 20;// a is static
        obj1.b = 10;// a is static

        System.out.println(obj1.a);//20
        System.out.println(obj1.b);//10

        staticReview obj2 = new staticReview();
        obj2.a = 30;
        obj2.b = 40;
        System.out.println(obj2.a);//30
        System.out.println(obj2.b);//40

        System.out.println("==========================================");


        System.out.println(name);
        //System.out.println(id); compiler error instance method can not be run directly. Main method is static
    }
        static String name="John";
        String id="123";

    }

