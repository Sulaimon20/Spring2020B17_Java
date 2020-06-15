package day40_Encapsulation.Task1_Bank;

public class BankOfAmerica {
    public static void main(String[] args) {

        EmployeeInfo Abdul=new EmployeeInfo();
        Abdul.setAddress("VA, Springfield");


        System.out.println(Abdul.getAddress());
        System.out.println(Abdul.companyName);
        System.out.println(Abdul.getSalary());



    }
}
