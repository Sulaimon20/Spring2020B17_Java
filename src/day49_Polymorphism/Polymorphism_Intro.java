package day49_Polymorphism;



interface Animal{

}
class Dog implements Animal{

}
class Cat implements Animal{

}

public class Polymorphism_Intro {
    public static void main(String[] args) {

        //Animal dog=new Animal();
        Animal obj=new Dog();
        Animal obj1=new Cat();
        Dog obj2=new Dog();
        Cat obj3=new Cat();
        Animal [] animalShow={obj,obj1,obj2,obj3};
        Dog [] dogShow={obj2};



    }
}
