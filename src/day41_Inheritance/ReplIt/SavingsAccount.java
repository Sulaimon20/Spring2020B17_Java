package day41_Inheritance.ReplIt;

public class SavingsAccount extends BankAccount{
    public double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public SavingsAccount(double number){
        this.interestRate=number;

    }

}
