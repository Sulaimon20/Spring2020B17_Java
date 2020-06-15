package day37_Constructors;

public class Data {
    static int staticVariable=300;
    int instanceVariable=400;

    public static void staticMethod(){//static method cannot be called
        System.out.println("static method");
    }
    public void instanceMethod(){//instance method is printable
        System.out.println("instance method");
    }
    public static void main(String[] args) {
    Data da=new Data();
    da.instanceMethod();



    }
}
