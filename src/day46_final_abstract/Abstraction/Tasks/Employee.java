package day46_final_abstract.Abstraction.Tasks;

abstract public class Employee {
    public String name;
    public int age;
    public char gender;
    public double salary;
    public String jobTitle;

    abstract void work();
    public String toString() {
        return "name: "+name+"\nage: "+age+"\ngender: " + gender +
                "\nsalary: "+salary+"\njobTitle: "+jobTitle;
    }
}
class Tester extends Employee{
    public void work(){
        System.out.println(name+" is working");
    }

    public Tester(String name,int age,char gender,double salary,String jobTitle) {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
        this.jobTitle=jobTitle;
    }
}
class Developer extends Employee{
    public void work(){
        System.out.println(name+" is working");
    }

    public Developer(String name,int age,char gender,double salary,String jobTitle) {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
        this.jobTitle=jobTitle;
    }
}

