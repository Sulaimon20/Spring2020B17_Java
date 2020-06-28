package day50_Polymorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a=100;
        double b=a; //implicit casting
        byte c=(byte)a; //manually, explicit
        Dog dog=new Dog("A", "M",1);
        Animal animal= (Animal) dog;//upcasting
        animal=dog;

        Animal animal2=new Cat("A", "M",1);
        Cat cat=new Cat("A", "M",1);
    //  DOWNCASTING
        Animal animal3=new Dog("A", "M",2);
        Dog dog3=(Dog) animal3;//downcasting, MUST be done manually

        Animal animal4=new Cat("A", "M",2);
        Cat cat2=(Cat) animal4;
        System.out.println("========================================");
    //  UPCASTING

        //Method 1
        Animal animal5=new Dog("Lucy", "F",3);
        Dog dog2=(Dog) animal5;
        dog2.bark();
        //Method 2
        ((Dog) animal5).bark();




    }
}
