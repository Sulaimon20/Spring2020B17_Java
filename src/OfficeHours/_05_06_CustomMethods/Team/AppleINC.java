package OfficeHours._05_06_CustomMethods.Team;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {
    public static void main(String[] args) {

        Tester tester1=new Tester();
        tester1.setInfo("Nur","Junior Tester",75000,1345);
        Tester tester2=new Tester();
        tester2.setInfo("Elton John","Junior Tester",75000,12422);
        Tester tester3=new Tester();
        tester3.setInfo("John","SDET",130000,1245);

        ScrumTeam scrum1=new ScrumTeam();//we can use arrayList in ScrumTeam class
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester2);
        scrum1.hireATester(tester1);
        scrum1.fireATester(12451);

  for (Tester each: scrum1.testerTeam){//prints out every single tester from scrumTeam
      System.out.println(each);
  }

        System.out.println("=======================================");

        Developer developer1=new Developer();
        developer1.setInfo("Todd"," Developer",205100.00,134543);
        Developer developer2=new Developer();
        developer2.setInfo("Mike","Junior Developer",75100.00,13325);
        Developer developer3=new Developer();
        developer3.setInfo("Liz","Developer",95010.00,13452323);
        Developer developer4=new Developer();
        developer4.setInfo("Joshua","Senior Developer",230000.00,134523);
        Developer developer5=new Developer();
        developer5.setInfo("William","Senior Developer",250000.00,1343523);

        scrum1.hireADeveloper(developer1);
        scrum1.hireADeveloper(developer2);
        scrum1.hireADeveloper(developer3);
        System.out.println(scrum1.devTeam.size());

        for (Developer each1: scrum1.devTeam){//prints out every single tester from scrumTeam
            System.out.println(each1);
        }
        System.out.println("In my scrumteam, we have " + scrum1.testerTeam.size()+" testers and "+scrum1.devTeam.size()+" developers");
    /*
    create scrum2: 4 developers, 2 testers
     */



        ScrumTeam scrum2=new ScrumTeam();//we can use arrayList in ScrumTeam class
        scrum2.hireADeveloper(developer1);
        scrum2.hireADeveloper(developer2);
        scrum2.hireADeveloper(developer3);
        scrum2.hireADeveloper(developer4);
        scrum2.hireATester(tester1);
        scrum2.hireATester(tester2);

        System.out.println(scrum2.devTeam.size()+scrum2.testerTeam.size());

        ScrumTeam scrum3=new ScrumTeam();//we can use arrayList in ScrumTeam class
        scrum3.hireADeveloper(developer1);
        scrum3.hireADeveloper(developer2);
        scrum3.hireADeveloper(developer3);
        scrum3.hireADeveloper(developer4);
        scrum3.hireADeveloper(developer5);
        scrum3.hireATester(tester1);
        scrum3.hireATester(tester2);
        scrum3.hireATester(tester3);
        System.out.println("============================");
        System.out.println(scrum3.devTeam.size()+scrum3.testerTeam.size());
        System.out.println("============================");


        ScrumTeam [] scramTeamArr={scrum1,scrum2,scrum3};
        for (ScrumTeam each:scramTeamArr ){
            for (Tester eachTester: each.testerTeam){
                if(eachTester.salary>120000.00){
                    System.out.println(eachTester);
                }
            }
        }
        System.out.println("============================");
        for (ScrumTeam each:scramTeamArr ){
            for (Developer eachDeveloper: each.devTeam){
                if(eachDeveloper.salary>120000.00){
                    System.out.println(eachDeveloper);
                }
            }
        }

        System.out.println("============================");

        ArrayList<ScrumTeam> scrumArrLis=new ArrayList<>(Arrays.asList(scrum1,scrum2,scrum3));
        for (ScrumTeam each: scrumArrLis){
            each.testerTeam.removeIf(p-> p.salary<100000.00);
            for (Tester eachTester: each.testerTeam){
                System.out.println(eachTester);
            }
        }
        System.out.println("============================");
        for (ScrumTeam each: scrumArrLis){
            each.devTeam.removeIf(p-> p.salary<100000.00);
            for (Developer eachDeveloper: each.devTeam){
                System.out.println(eachDeveloper);
            }
        }


    }
}
