package day36_StaticBlock;


public class StaticBlock2 {
    static int a;
    static int b;
    int c;
    String name;
    Integer d;
    boolean s;
    char ch;
    static Tester tester1=new Tester();

    static {
        a=100;
        b=200;
        if (100>200){
            a=100;
        }else{
            b=200;
        }

    }


    public static void main(String[] args) {
        StaticBlock2 obj=new StaticBlock2();
        System.out.println(obj.c);
        System.out.println(obj.ch);
        System.out.println(obj.s);
        System.out.println(obj.d);
        System.out.println(obj.name);

    }
}
