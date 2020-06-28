package day50_Polymorphism;

public class AnimalObjects {
    public static void main(String[] args) {
    Dog obj1=new Dog("Lucy","Female", 5);
    // System.out.println(obj1.dogName);
    //obj1.bark();

    //this is polymorphism
    //RULES: 1. Reference type does matter: it decides what can be called and accessable
    //       2. Overriden
        Animal obj=new Dog("Lucy","Female", 5);
    //System.out.println(obj.dogName);
        obj.eat();//Lucy is eating
        obj.sleep();//Lucy is sleeping
        obj.method();
        obj1.method();
        obj1.methodA(23);

        if (obj instanceof Dog){
            System.out.println("dog");
        }else{
            System.out.println("not a dog");

        }

        boolean r=obj1 instanceof Dog;
        boolean r1=obj1 instanceof Animal;
        //boolean r2=obj1 instanceof Cat; compile error
        Animal obj3=new Cat("A","F",2) ;
        boolean r2=obj1 instanceof Animal;

        System.out.println(r);//true
        System.out.println(r1);//true
        System.out.println(r2);//true






    }
}
