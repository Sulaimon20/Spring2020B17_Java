package day49_Polymorphism;

public abstract class Employee {
    private String name;
    private int id;
    private String jobTitle;
    private double salary;

    public abstract void work();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Tester extends Employee  {

    @Override
    public void work() {

    }
}
class Developer extends Employee{

    @Override
    public void work() {

    }
}

class Objects{
    public static void main(String[] args) {
        Employee tester1=new Tester();
        Employee tester2=new Tester();
        Employee tester3=new Tester();
        Employee developer1=new Developer();
        Employee developer2=new Developer();
        Employee developer3=new Developer();
        Employee developer4=new Developer();
        Employee developer5=new Developer();
        
        Employee [] scrumTeam={tester1,tester2,tester3,developer1,developer2,developer3,developer4,developer5};


    }
}