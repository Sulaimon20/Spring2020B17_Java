package day41_Inheritance.Animals;

public class Dog extends Animal {


    public void bark(){
        System.out.println(name+" is barking");
}
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Lucy";
        dog1.size="small";
        dog1.weight=12.4;
        //System.out.println(dog1);
        dog1.move();//Lucy is moving
        dog1.bark();




    }



}
