package day41_Inheritance.Task1;
//childclass
public class Tester extends Employee{

    //this is constructor for creating an object
    public Tester(String name,double salary, int id,
                  String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public void reportingBug(){
        System.out.println(name+" is reporting a bug");
    }

    public void testing(){
        System.out.println(name+" is testing");
    }






}
