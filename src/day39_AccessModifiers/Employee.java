package day39_AccessModifiers;

public class Employee {
    String name;
    String jobTitle;
    long ID;
    double salary;
/*
                add a constructor that can initialize name of employee

				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)

				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
 */
public Employee(String name){
    this.name=name;
    //we can do it this way too;
    //this(name) ===> is the same  ==> this.name=name;
}
public Employee(String name, String jobTitle){
    this.name=name;
    this.jobTitle=jobTitle;
    }

    public Employee(String name, String jobTitle, long ID){
        this.name=name;
        this.jobTitle=jobTitle;
        this.ID=ID;

    }
    public Employee(String name, String jobTitle, long ID, double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.ID=ID;
        this.salary=salary;
}
    public String toString(){
    return "Name: "+name+"\nPosition: " +jobTitle+"\nID: "+ ID+"\nSalary: $" +salary;
    }

    public static void main(String[] args) {

    Employee worker=new Employee("John", "SDET", 12345, 204000.24);
        System.out.println(worker);

    }

}
