package day00_Re_Studying.Abstraction;
interface T{
    public void interfaceMethod();
}
public abstract class Abstraction implements T{
    String name="from abstract class";
    public void Method(int a){
    System.out.println("regularMethod();");
    }
    public abstract void Method();
}
class Sub extends Abstraction {
    public Sub ojb2=new Sub();


    @Override
    public void interfaceMethod() {

    }

    @Override
    public void Method() {

    }
}