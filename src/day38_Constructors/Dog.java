package day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(){//this constructor by default without parameters
        name="unknown";
        breed="unknown";
        age=0;
    }
    public Dog(String bread){
        this.breed=bread;
        name="unknown1";
        age=1;

    }
    public Dog(String bread, int age){
        this.breed=bread;
        name="unknown1";
        this.age=age;

    }



}
