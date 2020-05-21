//in java to organize everything, we have to create package, comes first
package day38_Constructors;
import java.text.DecimalFormat;

//class is template where we create a methods
public class SalaryCalculator {
//instance variables
    double hourlyRate;
    int weeklyHours;

    //static variables
    static double stateTaxRate=0.0575;
    static double fedralTaxRate =0.16;

    //constructor with double argument
    public  SalaryCalculator(double hourlyRate, int weeklyHours){


//this. keyword is a reference variable that refers to the current object
        this.hourlyRate=hourlyRate;
        this.weeklyHours=weeklyHours;
    }
    public double salaryAftertax(){
        double salaryAftertax=salaryInfo()-(((hourlyRate*weeklyHours)*
                (stateTaxRate+fedralTaxRate))*4);
        return salaryAftertax;
    }
    public double salaryInfo(){
        return (hourlyRate*weeklyHours)*4;
    }
    public double annualSalary(){
        return salaryInfo()*12;
    }

    public String toString(){
    //DecimalFormat DF we need to round and reduce the floating point
        DecimalFormat DF = new DecimalFormat("0.00");
return  "Salary per hours: $"+ hourlyRate +
        "\nTotal hours per week "+weeklyHours +
        "h.\nMonthly salary: $"+ DF.format(salaryInfo())+
        "\nMonth salary after tax: $"+ DF.format(salaryAftertax())+
        "\nAnnual salary: $"+annualSalary();

    }

    public static void main(String[] args) {
        //here is a new object we create to run our program
        SalaryCalculator worker1=new SalaryCalculator(15,40);
        System.out.println(worker1);
        System.out.println("===========================");
        SalaryCalculator worker2=new SalaryCalculator(50,40);
        System.out.println(worker2);


    }


}
/*
Create class called SalaryCalculator
instance variables:
hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
add a constructor can initialize those fields
instance methods:
salary(): returns the total salary as double
salaryAftertax(): retuns the salary after tax as double
stateTax(): retuns the total state tax as double
federalTax(): retuns the total federal tax as double
toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */