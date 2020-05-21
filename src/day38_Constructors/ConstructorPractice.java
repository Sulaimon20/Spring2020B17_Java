package day38_Constructors;

public class ConstructorPractice {

    public ConstructorPractice(){
        this(1.2);
        System.out.println("A");
    }

    public ConstructorPractice(double a){

        System.out.println("B");

    }public ConstructorPractice(int b){
        this();
        System.out.println("C");

    }

}
