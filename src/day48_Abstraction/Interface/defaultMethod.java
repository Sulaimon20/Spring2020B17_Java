package day48_Abstraction.Interface;

abstract class T { }

public interface defaultMethod {
    default void method1(){//Default method only for Interface
        System.out.println("Default method");
    }

    static int method2() {
        return 0;
    }
    abstract void method3();

    public static void main(String[] args) {
        N obj= new N() {
            @Override
            public void method3() {

            }
        };
        obj.method1();
    }
}
abstract class N implements defaultMethod {

}