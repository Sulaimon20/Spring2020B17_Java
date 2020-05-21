package day37_Constructors.HomeWork;

import java.time.LocalDate;

public class Student {
    static String schoolName="Cybertek school";
    String name;
    int age;
    char gender;
    String birthday;

    public Student(String name, int age, char gender){
     this.name=name;
     this.age=age;
     this.gender=gender;
     this.birthday=birthday;

    }

    public String toString(){

        return "Name "+name+" Age:"+ age +" Gender: "+ gender+" School: "+schoolName;
    }

    public static void main(String[] args) {

        Student student1=new Student("Mike", 25, 'M');
        Student student2=new Student("Smith", 28, 'M');
        Student student3=new Student("Mary", 32, 'F');
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }


}
