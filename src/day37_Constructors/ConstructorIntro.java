package day37_Constructors;

public class ConstructorIntro {
// !!! every class MUST have a conctructor
// !!! methodName Must be same with class name
//  we can create ONLY one Constructor!!!!!!!!
//  object MUST be created woth existing constructor
// execution always depends


    public ConstructorIntro(){
        System.out.println("Default Constructor");
    }

    public ConstructorIntro(int a){
        System.out.println("Constructor with argument of int");
    }
    public ConstructorIntro(String a){
        System.out.println("Constructor with argument of String");
    }




    public static void main(String[] args) {

        ConstructorIntro object1=new ConstructorIntro();
        ConstructorIntro object2=new ConstructorIntro(10 );
        ConstructorIntro object3=new ConstructorIntro("String" );

       }
}
