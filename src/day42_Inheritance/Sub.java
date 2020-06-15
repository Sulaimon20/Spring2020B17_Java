package day42_Inheritance;

class Super {
    static int a=2;//static var;
    public Super(){
    System.out.println("super class default constructor");//this prints 1
    }
}
public class Sub extends Super{
    public Sub(){
        super();
        System.out.println("sub class default constructor");
    }
    public static void main(String[] args) {
        Sub obj=new Sub();          //super class default constructor
                                    //sub class default constructor
        //Super obj1= new Super();    //super class default constructor
    }
}
