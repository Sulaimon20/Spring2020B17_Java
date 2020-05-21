package day41_Inheritance.Task2;

public class SavingAccount extends BankAccount {
// interest is the same for everyone in the bank

    public static double interestRate;

    static {
        interestRate=0.02;
    }


}
