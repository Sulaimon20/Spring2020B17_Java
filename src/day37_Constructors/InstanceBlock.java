package day37_Constructors;

public class InstanceBlock {

//  static block => only executes once (the compiler prints it once)
    static {
        System.out.println("Static block");
    }
//  instance block  => executes as much as we pointed out  (the compiler prints )
    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {

        InstanceBlock obj=new InstanceBlock();// gonna print instance block
        //compiler output: Static block
        //                 Instance block





    }
}
