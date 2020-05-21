package day37_Constructors;

public class Student {
    String name;
    int age;
    char gender;
    String university;
//constructor
    public Student(String name, int age, char gender, String university){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.university=university;
    }
// initialization of the class = methods
    public void setInfo(String name, int age, char gender, String university){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.university=university;
    }

    public String toString(){
        return "Name: "+name+" Age: "+age+" Gender: <<"+gender+">> University: "+university;
    }

}
