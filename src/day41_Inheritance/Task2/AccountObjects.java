package day41_Inheritance.Task2;

public class AccountObjects {
    public static void main(String[] args) {
        //Checking account
        CheckingAccount obj=new CheckingAccount();
        obj.Balance=2000;
        obj.showBalance();
        System.out.println(obj);
        obj.accountHolder="Thomas Hill";
        obj.accountNumber=12345678;
        System.out.println(obj);
        obj.withdraw(100);
        System.out.println(obj);
        System.out.println("=========================");

        //Saving account

        SavingAccount saving = new SavingAccount();
        saving.accountHolder="Tamil";
        saving.deposit(10000);
        saving.interestRate=0.02;


        System.out.println();
        System.out.println(saving.interestRate);




    }
}
