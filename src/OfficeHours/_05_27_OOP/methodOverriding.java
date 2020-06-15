package OfficeHours._05_27_OOP;

public class methodOverriding {

    void  method1(){
        System.out.println("Super");
    }

}

class Test extends methodOverriding {

    @Override
    void method1() {
        System.out.println("Sub");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.method1();


        methodOverriding ob = new methodOverriding();
        ob.method1();


    }
}
