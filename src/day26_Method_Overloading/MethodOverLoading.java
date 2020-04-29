package day26_Method_Overloading;

public class MethodOverLoading {

    public static void main(String[] args) {
    method(10);     //int
    method(10.2);   //double

    }
    public static void method(int a){
        System.out.println("Original method");
    }
    public static void method(double b){
        System.out.println("Overloaded method");
    }

}
