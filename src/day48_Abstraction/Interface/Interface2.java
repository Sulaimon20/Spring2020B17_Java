package day48_Abstraction.Interface;

public interface Interface2 {
    //you need the initialize them right away
    //you can only have static or final
    //constructor

    //public Interface2(){} <==constructor impossible

    //public void method1(){}<== return void type method impossible
    //{   } <==instance blocks are impossible
    //static {}; <==static blocks are impossible
    int a=30;//this is by default static

    static void method2(){} //this is static method
    void method3(); //this is abstract method
    default void method4(){}//the default method used in Interface default method

    static void main(String[] args) {
    System.out.println(a);//this is the reason why you can print it
    //a=100;  <== this impossible
    System.out.println(Interface2.a);//we can call interface var through the interfaceName
    }


}

