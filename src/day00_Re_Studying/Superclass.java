package day00_Re_Studying;

 abstract class Superclass {

     void method2(){
         System.out.println("Superclass regular method");
     };
     abstract void method1(String a);

}
final class Subclass extends Superclass{
    void method() {
        System.out.println("Subclass method");
    }
    @Override
    void method1(String a) {
        System.out.println("Subclass method1");
    }
    @Override
    void method2(){
    super.method2();
    }
}

class Object{

    public static void main(String[] args) {
       //Superclass obj=new Superclass();
    Subclass obj2=new Subclass();
    obj2.method();
    obj2.method1("As");
    obj2.method2();
    }
}






