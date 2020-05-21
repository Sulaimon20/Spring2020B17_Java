package OfficeHours._05_20_Inheritance.Task2;


class Test{
    public Test(int a){
        System.out.println("A");
    }
}

public class Constructor extends Test {
    public Constructor(){
        super(10);
        System.out.println("B");
    }

    public static void main(String[] args) {
        Constructor obj=new Constructor();
    }
}
