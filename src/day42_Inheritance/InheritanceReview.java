package day42_Inheritance;

class B{
    public B(int a){
        System.out.println("int");
    }
    public B(double a){
        System.out.println("double");
    }
    public B (long a){
        this(2.2);
        System.out.println("long");
    }

        }


public class InheritanceReview extends B{
    public InheritanceReview(String a){
        super(2l);
        System.out.println("String");
    }


    public static void main(String[] args) {

        InheritanceReview obj=new InheritanceReview("Hello");//int String

    }
}
