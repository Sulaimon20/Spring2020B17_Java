package OfficeHours._05_06_CustomMethods.Team;

public class Tester {
    String name;
    String jobTitle;
    double salary;
    long emloyeeID;

    public void setInfo (String name, String jobTitle, double salary, long emloyeeID){
        this.name=name;
         this.jobTitle=jobTitle;
         this.salary=salary;
        this.emloyeeID=emloyeeID;
    }

    public String toString (){
        return  "name: "+name+" job title: "+jobTitle+
                " salary: $"+ salary+" emloyeeID "+ emloyeeID;
    }
public void smokeTesting(){

    System.out.println(name+" doing the smoke testing");
}

public void creatingTicket(){
    System.out.println(name+" is creating ticket on Jira");

}
}
