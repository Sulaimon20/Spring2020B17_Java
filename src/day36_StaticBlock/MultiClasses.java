package day36_StaticBlock;


import java.util.ArrayList;

class Tester {

    String name;
    long testEmployeeID;
    String jobTitle;
    double salary;


    public void setTesterInfo(String name, long testEmployeeID, String jobTitle, double salary) {
        this.name = name;
        this.testEmployeeID = testEmployeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    ArrayList<Tester> testersTeam=new ArrayList<>();

    public void hireTester(Tester tester){
        testersTeam.add(tester);
    }

    public void fireTester(long testEmployeeID){
        testersTeam.removeIf(p->p.testEmployeeID==testEmployeeID);
    }

}

class Developer {

    String name;
    long devEmployeeID;
    String jobTitle;
    double salary;


    public void setDevInfo(String name, long devEmployeeID, String jobTitle, double salary) {
        this.name = name;
        this.devEmployeeID = devEmployeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    ArrayList<Developer> devTeam=new ArrayList<>();

    public void hireDeveloper(Developer developer){
        devTeam.add(developer);

    }

    public void fireDeveloper(long devEmployeeID){
        devTeam.removeIf(p->p.devEmployeeID==devEmployeeID);
    }

}

class scrumTeam {


    public class MultiClasses {

    }
}