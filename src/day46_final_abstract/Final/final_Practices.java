package day46_final_abstract.Final;

public class final_Practices {
    final int a=10;
    final static int b=10;
//instance block can't be final
    {
        System.out.println(a);
    }
// static blocks can't be final
    static {
        System.out.println(b);

    }
    //constructor can't be final
    public final_Practices(){

    }
    //instance method can be final ==order before void is does not matter
    public final void method1(){
            }
    //static method can be final
    public final static void method2(){
    }

    class test extends final_Practices{
     //   public final_Practices(){ }
        //instance method can be final ==
        // order before void is does not matter
     //   public final void method1(){}
        //static method can be final
//        public final static void method2(){}


    }

}
