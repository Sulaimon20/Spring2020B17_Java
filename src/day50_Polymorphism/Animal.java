package day50_Polymorphism;

public abstract class Animal {
    public int age;
    public String gender;

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    //this is not overriden
    public void method(){
        System.out.println("A");
    }

}
