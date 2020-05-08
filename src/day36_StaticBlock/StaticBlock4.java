package day36_StaticBlock;


import OfficeHours._05_06_CustomMethods.Team.Tester;

public class StaticBlock4 {

    static String name;
    static Tester tester1=new Tester();

    int insVariable;

    static {
    name="CyberTek School";
    tester1.setInfo("Mihtar", "SDET", 234432, 345345);
    StaticBlock4 obj1=new  StaticBlock4();
        obj1.insVariable=300;
    }



    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);
    }
}
