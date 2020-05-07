package OfficeHours._05_06_CustomMethods.Team;

public class TesterObject {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.name="Sam";
        tester1.jobTitle="SDET";
        tester1.salary=200000;
        tester1.emloyeeID=12345678;
        //System.out.println(tester1);

        Tester tester2 = new Tester();
        tester2.setInfo("Gim", "SM", 20000.00, 1234567);
        System.out.println(tester1+"\n"+tester2);

        tester1.smokeTesting();//Sam doing the smoke testing
        tester2.smokeTesting();//Gim doing the smoke testing

        tester1.creatingTicket();//



    }
}
