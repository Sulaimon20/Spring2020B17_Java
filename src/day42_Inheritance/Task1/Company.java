package day42_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    public static void main(String[] args) {
        Employee employee1=new Employee();


        employee1.name="Kale";
        employee1.age=23;
        employee1.gender='F';
        employee1.employeeID=123456;
        employee1.jobTitle="SDET";
        employee1.Salary=150000;

        Employee employee2=new Employee();

        employee2.name="Dorry";
        employee2.age=29;
        employee2.gender='F';
        employee2.employeeID=123457;
        employee2.jobTitle="Analyst";
        employee2.Salary=2000000;

        Employee employee3=new Employee();

        employee3.name="Trezzy";
        employee3.age=21;
        employee3.gender='F';
        employee3.employeeID=123458;
        employee3.jobTitle="Developer";
        employee3.Salary=250000;


        ArrayList<Employee>list=new ArrayList<>();
        list.addAll(Arrays.asList(employee1,employee2,employee3));
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i).name+" "+list.get(i).employeeID);
        }

    }
}
