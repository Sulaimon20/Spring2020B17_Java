package OfficeHours._5_13_;

public class Constructor {
    //we create our own constructor
    public Constructor(){

    }

    public static void main(String[] args) {
        //this is default costructor
        Constructor obj=new Constructor();
        Employee obj1=new Employee("Sam", 123, 23456);


        Employee employee2=new Employee("Roma", 456, 12345);
        System.out.println(employee2);


    }

}
class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;


    }

}