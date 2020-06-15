package day00_Re_Studying.Constructor.Default;

public class Person {
    //instance var
    public String name;
    int age;
    char gender;
     String car;

    public String toString (){
        return name+", "+age+" years old, gender: "+gender+", has a "+car;
    }

    public static void main(String[] args) {
        Person person1=new Person();
        person1.name="Oleg";
        person1.age=24;
        person1.gender='M';
        person1.car="BMW";
        System.out.println(person1);

        Person person2=new Person();
        person2.name="Tim";
        person2.age=30;
        person2.gender='M';
        person2.car="Toyota";
        System.out.println(person2);

        Person person3=new Person();
        person3.name="Dim";
        person3.age=35;
        person3.gender='M';

        System.out.println(person3);

    }


}
