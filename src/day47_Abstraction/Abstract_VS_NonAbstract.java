package day47_Abstraction;
//in non Abstract class you can not have abstract method
final class Test1{                 // regular or final class
    public Test1(){

    }               //constructor
    public void method1(){}        //public method

    public static void method2(){} //static method
  //public abstract void method3(){} cannot be exist

    int a=100;                     //instance var
    static int b=200;              //static var
    {

    }                             //instance block
    static {

    }                      //static block
        }
abstract class Test2{             //abstract class
    public Test2(){

    }              // constructor

    public void method1(){}       //method
    public static void method2(){}//static method
    public abstract void method3();//abstract method
    int a=100;
    static int b=200;
    final int c=210;
    {   System.out.println("Hello");     }
    static {}
}
public class Abstract_VS_NonAbstract {
    Test1 object1=new Test1();




}
