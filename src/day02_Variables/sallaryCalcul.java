package day02_Variables;

public class sallaryCalcul {
    public static void main(String[] args) {

        double rate = 55;
        double stateTax = 0.04;
        double federalTax = 0.22;
        double weeklyHours = 45;
        double annualSalary = 55*45*4*12;
        double totalTax=federalTax+stateTax;
        double afterTax=annualSalary*totalTax;
        double incomeAfterTax=annualSalary-afterTax;

        System.out.println("Your salary is: $"+annualSalary);
        System.out.println("Your total tax is: $"+afterTax);
        System.out.println("Your income after tax is: $"+incomeAfterTax);
    }
}
