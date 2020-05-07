package day34_Custom_Class.Testers;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

        ArrayList<Tester> testersTeam=new ArrayList<>();
     public void hireTester(Tester tester){
         testersTeam.add(tester);
     }
     public void fireTester(long emloyeeID){
         testersTeam.removeIf(p->p.employeeID==emloyeeID);
     }

}
