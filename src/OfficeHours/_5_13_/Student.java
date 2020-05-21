package OfficeHours._5_13_;
//static means only one copy;
public class Student {
    String name;
    long id;
    static String schoolName="Cybertek";

    public String toString(){
        return "Name: "+name+", id: "+id+" "+schoolName;
    }
    public void printSchoolName(){
        System.out.println(schoolName+" School");
    }
}
class studentObjects{
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Madina";
        student1.id=12345;
        System.out.println(student1);

        Student student2=new Student();
        student2.name="Odina";
        student2.id=2345;

        System.out.println(student2);

    }
}
