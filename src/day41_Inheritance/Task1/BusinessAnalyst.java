package day41_Inheritance.Task1;

public class BusinessAnalyst extends Employee {
    public BusinessAnalyst(String name,double salary, int id, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }
    public void collecting(){
        System.out.println(name+" is collecting requirements");
            }

    public void gathering(){
        System.out.println(name+" is gathering");
    }
}
