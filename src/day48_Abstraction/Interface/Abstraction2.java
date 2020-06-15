package day48_Abstraction.Interface;

interface A1{
    void method1();

}
interface B1{
    int method2();
}
interface C1{
    void method3();
}

public class Abstraction2 implements A1, B1, C1 {
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 10;
    }

    @Override
    public void method3() {

    }
}
