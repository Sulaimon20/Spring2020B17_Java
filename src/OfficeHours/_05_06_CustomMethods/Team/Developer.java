package OfficeHours._05_06_CustomMethods.Team;

public class Developer {
    String name;
    String jobTitle;
    double salary;
    long emloyeeID;

    public void setInfo (String name, String jobTitle, double salary, long emloyeeID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.emloyeeID = emloyeeID;
    }
    public String toString (){
        return  "name: "+name+" job title: "+jobTitle+
                " salary: $"+ salary+" emloyeeID "+ emloyeeID;
    }
    public void coding(){
        System.out.println(name+" is coding");

    }
    public  void fixingBug(){
        System.out.println(name+ " is fixing a bug");
    }


}
