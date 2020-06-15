package day00_Re_Studying.Exam;

public class _69_Encapsulation {
    private String name;
    private int age;
    private int salary;

    public _69_Encapsulation(String name, int age){
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void printDetails(){
        System.out.println(name+" "+ age+" "+salary);
    }

    public static void main(String[] args) {
        //_69_Encapsulation e1=new _69_Encapsulation();
        _69_Encapsulation e2=new _69_Encapsulation("Ja",50);
        _69_Encapsulation e3=new _69_Encapsulation("Sha", 5000);
        //e1.printDetails();
        e2.printDetails();
        e3.printDetails();

    }
}
