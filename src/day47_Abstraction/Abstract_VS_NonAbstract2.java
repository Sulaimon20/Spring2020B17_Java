package day47_Abstraction;

abstract class A{
    public abstract void method1();
    public void method(){}
}

public class Abstract_VS_NonAbstract2 extends A{
    
//here we have two methods: abstract and instance
    @Override
    public void method1() {}//mandatory to override the method

}
abstract class B extends A { //optional to override the abstract method of A
//here we have two methods: abstract and instance

    public B() {
        super();
    }
}
class C extends B{

    @Override
    public void method1() {

    }

    public static void main(String[] args) {
        C obj1=new C();
        obj1.method1();
    }
}