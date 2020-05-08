package day35_Static;

public class Offer {
    /*
    1. Create a class called Offer that has:
    instance fields :
            location, company, salary , isFullTime

     */
    String location;
    String company;
    double salary;
    boolean isFullTime;
    public void setInfo(String location, String company, double salary, boolean isFullTime){
        this.location=location;
         this.company=company;
         this.salary=salary;
         this.isFullTime=isFullTime;

    }

    public String toString(){
        return "Location: "+location+
                " Company name: "+company+
                " Salary: &"+salary+
                " Fulltime: "+isFullTime;

    }







}
