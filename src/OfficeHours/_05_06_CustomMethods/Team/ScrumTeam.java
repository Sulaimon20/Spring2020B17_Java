package OfficeHours._05_06_CustomMethods.Team;

import java.util.ArrayList;

public class ScrumTeam {
    ArrayList<Tester> testerTeam=new ArrayList<>();
    ArrayList<Developer> devTeam=new ArrayList<>();

    public void hireATester(Tester tester){
        testerTeam.add(tester);
        }
    public void fireATester(long id){
        testerTeam.removeIf(p -> p.emloyeeID==id);
    }


    public void hireADeveloper(Developer developer){
        devTeam.add(developer);
    }
    public void fireADeveloper(long id){
        devTeam.removeIf(eachDev -> eachDev.emloyeeID==id);
    }



}
