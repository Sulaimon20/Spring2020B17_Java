package day41_Inheritance.WarmUp;

public class BankAccount1 {

    static String BankName;
    String firstName;
    String lastName;
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount1(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void depositing(double amount){
        System.out.println("Depositing $"+amount);
        balance+=amount;
    }

    public void withDrawing(double amount){

        if (balance<=0){
            System.out.println("Not available balance to withdraw money");
            return;
        }
        System.out.println("Withdrawing $"+amount);
        balance -= amount;
        if (balance<0){
            balance-=35;
        }

    }

    public void Balance(){
        System.out.println("Available Balance: "
                +balance);
    }


    public String toString() {
        return "firstName: " + firstName + '\'' +
                ", lastName: " + lastName + '\'' +
                ", balance: ?" + balance;
    }
}
/*
create costum class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
 */