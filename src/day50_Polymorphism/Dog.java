package day50_Polymorphism;

public final class Dog extends Animal{//3 var, 3 methods
    public String dogName;

    public Dog(String dogName, String gender, int age){
        this.dogName=dogName;
        this.gender=gender;
        this.age=age;
    }
    public void eat(){
        System.out.println(dogName+" is eating");
    }
    @Override
    public void sleep(){
        System.out.println(dogName+" is sleeping");
    }
    public void bark(){
        System.out.println(dogName+" is barking");
    }
    //this is overloaded
    public void methodA(int a){
        System.out.println("Dog class A");
    }


}
