package day38_Constructors;

public class Test {


    //     instance block
    {// if no object, it is not gonna execute
        System.out.println("Instance block");
    }
    //      Main method
    public static void main(String[] args) {

        new Test();//object for instance and constructor blocks
        System.out.println("Main method");

    }
//      constructor
    public Test(){
        System.out.println("Constructor block");
    }

    //      Static blocks
    static{
        System.out.println("Static block");
    }
}
