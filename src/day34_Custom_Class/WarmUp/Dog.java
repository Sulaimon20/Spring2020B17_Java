package day34_Custom_Class.WarmUp;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;

    // this we need to write the parameters
    public void setDogInfo(String breed, String size, int age, String color, String name){

        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
        this.name=name;
    }

    // this we need to print
    public String toString(){
    return "Dog name: "+name+
            "\nDog breed: "+breed+
            "\nDog size: "+size+
            "\nDog age: "+age+
            "\nDog color: "+color;

}

    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.setDogInfo("Ovcharka", "small", 3, "white","Laika");

        System.out.println(dog1);

    }

}
