package day33_Custom_Class;

public class CapitalOne {

    public static void main(String[] args) {
        BankAccount Anna = new BankAccount();
        Anna.accountHolder = "Anna";
        Anna.accountNumber = 123456;

        Anna.deposit(100);
        Anna.checkingBalance();

        Anna.withDraw(200);
        Anna.checkingBalance();

        Anna.withDraw(200);

        Anna.checkingBalance();
        Anna.withDraw(200);

        Anna.checkingBalance();

                System.out.println("==================================================");

        System.out.println(Anna);

    }
}