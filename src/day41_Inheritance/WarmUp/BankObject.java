package day41_Inheritance.WarmUp;

public class BankObject {
    public static void main(String[] args) {
        BankAccount name=new BankAccount("Irina", "Taem");
        name.setBalance(2345);
        name.setAccountNumber(12234567);
        System.out.println(name.getBalance());
        System.out.println(name.getAccountHolder());
        name.withDrawing(12);
        System.out.println(name.getBalance());


        System.out.println(name);
        name.withDrawing(200000);
        System.out.println(name);


    }
}
