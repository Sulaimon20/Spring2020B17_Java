package day00_Re_Studying.Exam;

public class _95_Inheritance {
}

 class Base{

    public void test(){
        System.out.println("Base");
    }
}
class DerivedA extends Base{
    @Override
    public void test(){
        System.out.println("DerivedA");
    }

}
class DerivedB extends DerivedA{
    @Override
    public void test(){
        System.out.println("DerivedB");
    }

    public static void main(String[] args) {
        Base b1=new DerivedB();
        Base b2=new DerivedB();
        Base b3=new DerivedB();

        b1 =(Base) b3;
        b1.test();
        Base b4=(DerivedA) b3;
        b1.test();
        b4.test();


    }
}
