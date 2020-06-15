package day48_Abstraction.Interface;

interface P{
void method1();
}
interface Q{
    int  method2();

}
abstract class R{
    //Constructor
    public R(){

    }
    abstract void method3();
}
//  the ONLY condition: extends should be first
public class extends_implements2 extends R implements P, Q {

    public static void main(String[] args) {

    }
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
    return 0;
    }

    @Override
    void method3() {

    }
}
