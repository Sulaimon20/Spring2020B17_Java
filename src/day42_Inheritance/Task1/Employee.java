package day42_Inheritance;

public class Employee {
   /*
   attributes: name, age, gender, Salary, employeeID, jobTitle
	methods: work, setEmployeeInfo, toString
    */
    public String name;
    public int age;
    public char gender;
    public double  Salary;
    public long employeeID;
    public String jobTitle;

    public void work(){
        System.out.println(name+ " is working");
    }
    public void setEmployeeInfo(String name, int age, char gender, double  Salary, long employeeID, String jobTitle) {
        this.name = name;
        this.age=age;
        this.gender=gender;
        this.Salary=Salary;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
    }


    public String toString() {
        return "Name: "+name+", age: "+age+", gender: "+gender+", Salary: "+Salary+", employeeID: "
                +employeeID+", jobTitle: "+jobTitle;
    }
}
