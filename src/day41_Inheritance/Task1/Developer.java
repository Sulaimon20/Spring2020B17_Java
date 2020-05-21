package day41_Inheritance.Task1;

public class Developer extends Employee {

    public Developer(String name,double salary, int id, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public void fixingBug() {
        System.out.println(name + " is fixing a bug");
    }
    public void coding (){
        System.out.println(name+ " is coding");
    }



}
