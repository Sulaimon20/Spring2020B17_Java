package OfficeHours._05_20_Inheritance.Task1;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
           dog1.setInfo("Karabas",5,"black","large","Husky");

        Dog dog2 = new Dog();
        dog1.setInfo("Rindik", 5, "White", "Huge","Kangal");

        System.out.println(dog1);
        System.out.println(dog2);

        dog2.bark();
        // dog2.scratch();
        System.out.println("=======================================================================");

        Cat cat1 = new Cat("Muffin",7,"white","medium","Ragdoll");
        //  cat1.setInfo("Muffin",7,"white","medium","Ragdoll");

        System.out.println(cat1);

        cat1.scratch();
        //  cat1.bark();

        System.out.println("============================================================");

        Bunny bunny1 = new Bunny("Bug",3,"white","small","tiny");

        System.out.println(bunny1);
        bunny1.dig();
        //   bunny1.scratch();









    }

}