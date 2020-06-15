package OfficeHours._05_27_OOP;

public class methodOverriding2 {

    protected void method1(){

    }
    public static void method2(){

    }

}
    class TestClass extends methodOverriding{

    protected void method1(){

    }
    //@Override ==> static can't be overriden
    public static void method2(){

    }

}
