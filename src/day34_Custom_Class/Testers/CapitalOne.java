package day34_Custom_Class.Testers;

public class CapitalOne {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setTesterInfo("Liz", 111,"Manual tester", 70000.00);;

        ScrumTeam scrum=new ScrumTeam();
        scrum.hireTester(tester1);
        System.out.println(scrum.testersTeam.size());
        scrum.fireTester(111);
        System.out.println(scrum.testersTeam.size());





    }
}
