package day36_StaticBlock;
// we have to create the instance variables, developer,
//testers and scrumTeam;
import java.time.LocalDate;
import java.util.ArrayList;


class Tester{
    int employeeID;
    String name;
    String jobTitle;
    double salary;
    //LocalDate birthDay;
   // LocalDate beginsWork;


    public void setInfo(int employeeID, String name, String jobTitle, double salary){
        this.employeeID=employeeID;
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary= salary;
       // this.birthDay=birthDay;
        //this.beginsWork=beginsWork;
    }


    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setInfo(123456, "John Smith", "SDET", 200000);
        Tester tester2=new Tester();
        tester2.setInfo(123457, "Sam Duglass", "senior SDET", 200000);


        ArrayList<Tester> testersTeam=new ArrayList<>();

    }







}

class Developer{

    int employeeID;
    String name;
    String jobTitle;
    double salary;
    LocalDate birthDay;
    LocalDate beginsWork;


    public void setInfo(int employeeID, String name, String jobTitle, double salary, LocalDate birthDay, LocalDate beginsWork){
        this.employeeID=employeeID;
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary= salary;
        this.birthDay=birthDay;
        this.beginsWork=beginsWork;
    }
}

class scrumTeam{
    }

public class MultiClasses {

    public static void main(String[] args) {





    }
}