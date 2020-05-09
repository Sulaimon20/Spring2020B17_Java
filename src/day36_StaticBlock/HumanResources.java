package day36_StaticBlock;

import OfficeHours._05_06_CustomMethods.Team.Developer;

public class HumanResources {

        static Developer dev1=new Developer();

        static Developer dev2=new Developer();
        static Developer dev3=new Developer();
        static Developer dev4=new Developer();
        static Developer dev5=new Developer();
  //  public static void main(String[] args) {   }

    static {

        dev1.setInfo("Saim", "Developer", 200000, 12345);


    }


}
