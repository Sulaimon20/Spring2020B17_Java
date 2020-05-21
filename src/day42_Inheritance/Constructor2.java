package day42_Inheritance;

class Test{

    public Test(int a ){
        this(2.5);
        System.out.println("A");
    }
    public Test(double a ){
        System.out.println("C");
    }
}

    public class Constructor2 extends Test{

    public Constructor2(){
    //super keyword ==> refers to the object instance of the super class.
    // used for calling the cons from superclass
        super(10.5);
        System.out.println("B");
}

        public static void main(String[] args) {

        //Test obj=new Test(12);// A

            Constructor2 obj2=new Constructor2();//A B


        }


}
