package day50_Polymorphism.Task1;

public class Animal  {
    public String name;
    public int age;
    public void eat(){
        System.out.println(name+" is eating");
    };
    public void sleeping(){
        System.out.println(name+" is sleeping");
    };

    public String toString() {
        return "Name: "+name+", age: "+age;
    }
}
class Dog extends Animal{
    public Dog(String name, int age) {
        this.name=name;
        this.age=2;
    }

    public void bark(){
        System.out.println(name+" is barking");
    }
}
class Cat extends Animal{
    public Cat() {
        this.name="Murzik";
        this.age=1;
    }
    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
class Birds extends Animal{
    public Birds() {
        this.name="Popugai";
        this.age=3;
    }
    public void flying(){
        System.out.println(name+" is flying");
    }
}
class Cows extends Animal{
    public Cows() {
        this.name="Milka";
        this.age=4;
    }
    public void muing(){
        System.out.println(name+" is muing");
    }
}
class Animal_Objects{
    public static void main(String[] args) {
        Animal [] animals= new Animal[4];
        animals[0] =new Dog("Lucy", 2);
        animals[1] =new Cat();
        animals[2] =new Birds();
        animals[3] =new Cows();

        for (int i = 0; i <animals.length ; i++) {
            System.out.println(animals[i]);
            animals[i].eat();
            animals[i].sleeping();
            System.out.println("===================");
        }

    }
}
