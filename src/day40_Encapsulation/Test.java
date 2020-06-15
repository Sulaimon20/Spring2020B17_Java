package day40_Encapsulation;

public class Test {



    public Test(){// A. default constructor
        System.out.println("A");
    }
    public Test(int a){// B. constructor with int parameter
        this(2.5);
        System.out.println("B");
    }
    public Test(double a){//C. constructor with double parameter
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        Test obj=new Test(100);//call ACB
    }

}
