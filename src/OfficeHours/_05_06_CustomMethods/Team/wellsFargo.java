package OfficeHours._05_06_CustomMethods.Team;

import OfficeHours._05_06_CustomMethods.Team.Developer;
import OfficeHours._05_06_CustomMethods.Team.ScrumTeam;
import OfficeHours._05_06_CustomMethods.Team.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class wellsFargo {
    public static void main(String[] args) {


        Tester tester1=new Tester();
        tester1.setInfo("Nur","Junior Tester",75000,1345);
        Tester tester2=new Tester();
        tester2.setInfo("Elton John","Junior Tester",75000,12422);
        Tester tester3=new Tester();
        tester3.setInfo("John","SDET",130000,1245);

        Developer developer1=new Developer();
        developer1.setInfo("Todd"," Developer",205100.00,134543);
        Developer developer2=new Developer();
        developer2.setInfo("Mike","Junior Developer",75100.00,13325);
        Developer developer3=new Developer();
        developer3.setInfo("Liz","Developer",95010.00,13452323);


        ScrumTeam scrum1=new ScrumTeam();//3 Developer, 3 tester
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester2);
        scrum1.hireATester(tester1);
        scrum1.hireADeveloper(developer1);
        scrum1.hireADeveloper(developer2);
        scrum1.hireADeveloper(developer3);


        System.out.println("=======================================");

        Tester tester1a=new Tester();
        tester1a.setInfo("Romeo","Junior Tester",89000,1345);
        Tester tester2a=new Tester();
        tester2a.setInfo("Dina","Junior Tester",90000,12422);
        Tester tester3a=new Tester();
        tester3a.setInfo("Anton","SDET",130000,1245);

        Developer developer1a=new Developer();
        developer1a.setInfo("Timur"," Developer",104100.00,134543);
        Developer developer2a=new Developer();
        developer2a.setInfo("Frank","Junior Developer",111100.00,13325);
        Developer developer3a=new Developer();
        developer3a.setInfo("Gina","Developer",105010.00,13452323);
        Developer developer4a=new Developer();
        developer4a.setInfo("Murad","Developer",125010.00,13452323);


        ScrumTeam scrum2=new ScrumTeam();//3 Developer, 3 tester
        scrum2.hireATester(tester3a);
        scrum2.hireATester(tester2a);
        scrum2.hireATester(tester1a);
        scrum2.hireADeveloper(developer1a);
        scrum2.hireADeveloper(developer2a);
        scrum2.hireADeveloper(developer3a);
        scrum2.hireADeveloper(developer4a);


        System.out.println("=======================================");

        Tester tester1b=new Tester();
        tester1b.setInfo("Sam","Junior Tester",89000,1345);
        Tester tester2b=new Tester();
        tester2b.setInfo("Kit","Junior Tester",90000,12422);
        Tester tester3b=new Tester();
        tester3b.setInfo("Dimon","SDET",130000,1245);

        Developer developer1b=new Developer();
        developer1b.setInfo("Jim"," Developer",204100.00,134543);
        Developer developer2b=new Developer();
        developer2b.setInfo("Conrad","Junior Developer",111100.00,13325);
        Developer developer3b=new Developer();
        developer3b.setInfo("Adelina","Developer",115010.00,13452323);
        Developer developer4b=new Developer();
        developer3b.setInfo("Anjelika","Developer",125010.00,13452323);
        Developer developer5b=new Developer();
        developer3b.setInfo("Bonny","Developer",111010.00,13452323);


        ScrumTeam scrum3=new ScrumTeam();//3 Developer, 3 tester
        scrum3.hireATester(tester3b);
        scrum3.hireATester(tester2b);
        scrum3.hireATester(tester1b);
        scrum3.hireADeveloper(developer1b);
        scrum3.hireADeveloper(developer2b);
        scrum3.hireADeveloper(developer3b);
        scrum3.hireADeveloper(developer4b);
        scrum3.hireADeveloper(developer5b);

        System.out.println("=======================================");

        System.out.println("Creat Array for Scram Team");

        ScrumTeam [] scramTeamArr={scrum1,scrum2,scrum3};

        System.out.println("How to print out testers who are making more than 120000");
        for (ScrumTeam each:scramTeamArr ){
            for (Tester eachTester: each.testerTeam){
                if(eachTester.salary>120000.00){
                    System.out.println(eachTester);
                }
            }
        }

        System.out.println("============================");
        System.out.println("How to print out Developers who make less than 120000");
        for (ScrumTeam each:scramTeamArr ){
            for (Developer eachDeveloper: each.devTeam){
                if(eachDeveloper.salary>120000.00){
                    System.out.println(eachDeveloper);
                }
            }
        }

        System.out.println("============================");
        System.out.println("Create an Arraylist of scrum");
        ArrayList<ScrumTeam> scrumArrLis=new ArrayList<>(Arrays.asList(scrum1,scrum2,scrum3));
        for (ScrumTeam each: scrumArrLis){
            each.testerTeam.removeIf(p-> p.salary<100000.00);
            for (Tester eachTester: each.testerTeam){
                System.out.println(eachTester);
            }
        }

        System.out.println("============================");
        System.out.println("remove all the developers who have salary < 120_000");
        for (ScrumTeam each: scrumArrLis){
            each.devTeam.removeIf(p-> p.salary<120000.00);
            for (Developer eachDeveloper: each.devTeam){
                System.out.println(eachDeveloper);
            }
        }



















    }

}
