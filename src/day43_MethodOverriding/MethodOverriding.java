package day43_MethodOverriding;

//parents/super class


class Test {

    //method
    public void method(){
        System.out.println("B");
    }
}

//child/sub class
public class MethodOverriding extends Test {

    //method
    @Override

    public void method(){
        System.out.println("C");
    }


    public static void main(String[] args) {


        Test test1=new Test();
        test1.method();//A

        MethodOverriding obj=new MethodOverriding();
        obj.method();//B


    }

}

