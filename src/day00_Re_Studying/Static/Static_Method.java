package day00_Re_Studying.Static;

public class Static_Method {
    static String name;
    static void staticMethod(){
        System.out.println("Static method");
    }
    public void instanceMethod(){
        System.out.println("instance method");
    }

    public static void main(String[] args) {
        Static_Method.staticMethod();
        System.out.println(Static_Method.name);
    }
}
