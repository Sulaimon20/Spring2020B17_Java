package day38_Constructors;

public class dogObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        System.out.println(dog1.name);  //unknown
        System.out.println(dog1.breed); //unknown
        System.out.println(dog1.age);   //0
        System.out.println("==========================");

        Dog dog2=new Dog("Husky");
        System.out.println(dog2.name);  //unknown1
        System.out.println(dog2.breed); //Husky
        System.out.println(dog2.age);   //1

        System.out.println("==========================");

        Dog dog3=new Dog("Poodle",4);
        System.out.println(dog3.name);  //unknown
        System.out.println(dog3.breed); //Poodle
        System.out.println(dog3.age);   //4


    }
}
