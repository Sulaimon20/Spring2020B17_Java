package day48_Abstraction.Interface;

interface I1{
    void method1();
        }
interface I2 extends I1{
    void method2();

}
abstract class AC implements I2 {
    abstract void method3();
}


public class extends_implements extends AC {
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
class testRun extends extends_implements{
    @Override
    public void method2(){}
    @Override
    public void method3(){}


}