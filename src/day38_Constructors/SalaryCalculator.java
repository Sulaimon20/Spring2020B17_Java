package day38_Constructors;

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHours;
    static double stateTaxRate;
    static double fedralTaxRate;

    public void Salary(double hourlyRate, int weeklyHours){
        this.hourlyRate=hourlyRate;
        this.weeklyHours=weeklyHours;

    }
    public void salaryAftertax(double hourlyRate, int weeklyHours){
        this.hourlyRate=hourlyRate;
        this.weeklyHours=weeklyHours;

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