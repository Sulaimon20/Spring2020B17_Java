package day49_Polymorphism;
interface Animal{
    void breathing ();
}
class Dog2 implements Animal{
    public void breathing() {

    }
    public void barking() {

    }
}
class Cat2 implements Animal{
    public void breathing() {

    }
    public void scratching() {

    }
}

public class Polymorphism_Intro {
    public static void main(String[] args) {

        //Animal dog=new Animal();
       Animal obj=new Dog2();
       obj.breathing();

        Animal obj1=new Cat2();
        obj1.breathing();
        //obj1.scratching();
        Cat2 obj3=new Cat2();
        obj3.breathing();
        obj3.scratching();


        Dog2 obj2=new Dog2();

        Animal [] animalShow={obj,obj1,obj2,obj3};
        Dog2 [] dogShow={obj2};



    }
}
