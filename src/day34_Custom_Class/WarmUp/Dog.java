package day34_Custom_Class.WarmUp;

public class Dog {
    String breed;
    String size;
    int age;
    String color;
    String name;

    public void setDogInfo(String breed, String size, int age, String color, String name){

        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
        this.name=name;
    }
    public String toString(){
    return "Dog name: "+name+
            "\nDog breed: "+breed+
            "\nDog size: "+size+
            "\nDog age: "+age+
            "\nDog color: "+color;

}


}
