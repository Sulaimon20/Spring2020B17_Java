package OfficeHours._05_06_CustomMethods.Team;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {
    public static void main(String[] args) {
        Developer developer1=new Developer();
        developer1.setInfo("Simon", "Developer", 250000.00, 2134578);
        System.out.println(developer1);
        Developer developer2=new Developer();
        developer2.setInfo("Dimon", "Senior Developer", 270000.00, 2134232);
        System.out.println(developer2);

        developer1.coding();
        developer2.fixingBug();
        System.out.println("==========================");

        Developer [] developers = {developer1,developer2};
        System.out.println(developers[0]);//
        System.out.println(developers[1].jobTitle);//
        System.out.println("==========================");

        for (int i=0; i<developers.length;i++){
        System.out.println(developers[i]);
        }
        System.out.println("==========================");
        for (Developer each: developers){
            System.out.println(each);
        }

        System.out.println("==========================");
        for (Developer each: developers){
            System.out.println(each.name+""+each.salary);
        }

        System.out.println("==========================");

        ArrayList<Developer> developers1=new ArrayList<>();
        developers1.addAll(Arrays.asList(developer1,developer2));
        System.out.println(developers1.size());//2
        for(int i=0; i<developers1.size();i++){
            System.out.println(developers1.get(i));
        }
        System.out.println("==========================");

        for (Developer each: developers1){
            System.out.println(each.name+" "+each.emloyeeID+" "+each.salary);
        }



    }
}
