package day36_StaticBlock;

import OfficeHours._05_06_CustomMethods.Team.Developer;

import java.util.ArrayList;

/*
1. Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string
	2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees
	3. create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
				4. now go back to HumanResources class and comment out the static block
				5. repeat the step 3 to print out the employee info to compare it with previous output
 */
class Employee {
    String name;
    long id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setEmployeeInfo(String name, long id, int ssn, String jobTitle, double salary, char gender) {
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString() {

        return "Name: " + name + " ID: " + id + " SSN: " + ssn + " jobTitle: " + jobTitle + " Salary: " + salary + " Gender: " + gender;
    }
}

class HumanResources1 {

        static Employee worker1;
        static Employee worker2;
        static Employee worker3;
        static Employee worker4;
        static Employee worker5;

        static {
            worker1 = new Employee();
            worker2 = new Employee();
            worker3 = new Employee();
            worker4 = new Employee();
            worker5 = new Employee();

            worker1.setEmployeeInfo("Sam", 12345, 233434, "SDET", 120000, 'M');
            worker2.setEmployeeInfo("Riola", 12346, 233434, "Engeneer", 110000, 'F');
            worker3.setEmployeeInfo("Dimon", 12347, 263434, "PO", 150000, 'M');
            worker4.setEmployeeInfo("Teresa", 12385, 293434, "BA", 110000, 'F');
            worker5.setEmployeeInfo("Tim", 12349, 233474, "Developer", 125000, 'M');
        }
    }

class BankOfAzerbaijan{

    public static void main(String[] args) {

        ArrayList<Employee>list=new ArrayList<>();
        list.add(HumanResources1.worker1);
        list.add(HumanResources1.worker2);
        list.add(HumanResources1.worker3);
        list.add(HumanResources1.worker4);
        list.add(HumanResources1.worker5);

        System.out.println("=====================================");
        for (Employee each:list){
            System.out.println(each);
        }


    }

}




