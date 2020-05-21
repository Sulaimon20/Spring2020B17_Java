package day41_Inheritance.WarmUp;

public class BankAccount {
    public static String BankName = "Bank of America";
    public String firstName;
    public String lastName;

    private String accountHolder;//
    private long accountNumber;
    private double balance;

    //
    public BankAccount(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        //accountholder matches fullname
        //we have to concat first and last names
        accountHolder=firstName+" "+lastName;
    }
    //getter

    public String getAccountHolder(){
        return accountHolder;
    }
    //setter
    public void setAccountNumber(String firstName, String lastName){
        accountHolder=firstName+" "+lastName;
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //depositing = add money ==> increase the balance
    //we just need set a balance
    public void depositing(int amount){
        setBalance(balance+amount);
        // balance 100 amoont 20 ==> balance =120
    }

    public void withDrawing(int amount){
          setBalance(balance-amount);
        }
    public void checkBalance(){
        System.out.println("Available balance: "+balance);
    }

    public String toString(){
        return "Full Name: "+ getAccountHolder()+", Balance: "+getBalance();
    }
}
