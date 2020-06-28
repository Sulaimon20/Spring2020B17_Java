package OfficeHours._6_17_Exception;

public class TestPoly {
    public static void main(String[] args) {

//in polymorphism there are 3 references of reference type:
//  1)superclass as a reference type
        Animal dog=new Dog();
        Dog dog5 = (Dog) dog;
        //System.out.println(dog.breeds);
        System.out.println(dog.species);
        System.out.println(dog.toString());
        //dog.jump();
//  2) subclass as a reference type
        Dog dog1=new Dog();
        System.out.println(dog1.breeds);
        System.out.println(dog1.species);
        System.out.println(dog1.toString());
        dog1.jump();
//  3) interface as a reference type
        Jumpable dog2 =new Dog();
       // dog1.breeds;
        // dog1.species;
        dog1.toString();





    }
}
