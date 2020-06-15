package day43_MethodOverriding;

class Test {    //parents/super class

    public void method(){
        System.out.println("GrandPa");
    } //a method
}
class Test1 extends MethodOverriding { //this is subclass
    @Override
    public void method(){   //this is overridden method
        System.out.println("GrandSon");
        super.method();    }
}


public class MethodOverriding extends Test {//child/sub class

@Override
    public void method(){ //method
        System.out.println("Father");
        super.method();
    }
    public static void main(String[] args) {
        Test test1=new Test();
        //test1.method();//A
        MethodOverriding obj=new MethodOverriding();
        obj.method();//B
        Test1 t=new Test1();
        //t.method();


    }

}

