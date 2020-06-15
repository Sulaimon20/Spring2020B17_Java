package day40_Encapsulation.Task3_Credentials;

public class CredentialsObject {
    public static void main(String[] args) {

        Credentials facebook=new Credentials();

        facebook.setUserName("Daen");
        facebook.setPassWard("1231231");

        System.out.println(facebook.getUserName());//
        System.out.println(facebook.getPassWard());//

    }
}
