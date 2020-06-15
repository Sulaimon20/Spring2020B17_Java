package day46_final_abstract.Abstraction.Tasks;

public abstract class Pets {
    String name;
    int age;
    String color;
    String breed;
    char gender;

    abstract void sleep();
    abstract void eat();
    abstract void speak();


    public String toString() {
        return "name: "+name+"\nage: "+age+"\ncolor: "+color +
                "\nbreed: "+breed+"\ngender: " + gender;
    }
}
class Dog extends Pets {
     public void sleep(){
         System.out.println(name+" is sleeping");
        }
     public void eat(){
         System.out.println(name+" is eating");

     }
     public void speak(){
         System.out.println(name+" is speaking");
     }

    public Dog(String name,int age,String color,String breed,char gender) {
        this.name=name;
        this.age=age;
        this.color=color;
        this.breed=breed;
        this.gender=gender;
     }
}

class Cat extends Pets {
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void eat(){
        System.out.println(name+" is eating");

    }
    public void speak(){
        System.out.println(name+" is speaking");
    }

    public Cat(String name,int age,String color,String breed,char gender) {
        this.name=name;
        this.age=age;
        this.color=color;
        this.breed=breed;
        this.gender=gender;
    }
}

class Tiger extends Pets {
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void eat(){
        System.out.println(name+" is eating");

    }
    public void speak(){
        System.out.println(name+" is speaking");
    }

    public Tiger(String name,int age,String color,String breed,char gender) {
        this.name=name;
        this.age=age;
        this.color=color;
        this.breed=breed;
        this.gender=gender;
    }
}