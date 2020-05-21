package day38_Constructors;

public class ConstructorCalls3 {
    public ConstructorCalls3(){
        this(9);
        System.out.println("Default");
    }
    public ConstructorCalls3(int a){
        System.out.println("Int argument");
    }

    public static void main(String[] args) {
        new ConstructorCalls3(1);
    }


}
