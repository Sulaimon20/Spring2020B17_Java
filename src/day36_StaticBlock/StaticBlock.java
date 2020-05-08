package day36_StaticBlock;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    public static void method1(){
    System.out.println("Custom method execution");
}
    static{
        System.out.println("Hello Cybertek");// this gonna print first
    }
}
