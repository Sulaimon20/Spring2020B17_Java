package day42_Inheritance;

class SuperClass{
    int a=100;
//  constructor from Super
    public SuperClass (double a){
        System.out.println(this.a);//100
    }
}

public class SuperKeyword extends SuperClass {
    int a =200;
    int v=150;

    public SuperKeyword(){
        super(1.2);//100
        this.a=a;

        System.out.println(super.a);//100
        System.out.println(this.a);
    }
    public SuperKeyword(int v){
        this();
        System.out.println(this.v);
    }
    public static void main(String[] args) {
        SuperKeyword obj1=new SuperKeyword();// 100 100
        System.out.println("===================");
        SuperClass obj2=new SuperClass(2.1);//100
        SuperKeyword obj3=new SuperKeyword(2);// 100 100
        SuperClass obj4=new SuperKeyword(2);



    }
}
