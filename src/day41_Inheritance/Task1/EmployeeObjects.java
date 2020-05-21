package day41_Inheritance.Task1;

public class EmployeeObjects {

    public static void main(String[] args) {

        // Developer object
        Developer developer1 = new Developer("Dimon Smith", 20000, 12342, "Developer", 'M');
        // Tester object
        Tester tester1 = new Tester("Sam Theodor", 180000, 123345, "SDET", 'M' );
        BusinessAnalyst bAnalyst=new BusinessAnalyst("Lisa Schwarts", 250000, 123344, "Business Analyst", 'F' );
        developer1.coding();
        developer1.fixingBug();
        tester1.reportingBug();
        tester1.testing();
        System.out.println(tester1);
        System.out.println(developer1);
        System.out.println(bAnalyst);

    }
}
