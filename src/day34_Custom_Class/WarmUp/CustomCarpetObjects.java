package day34_Custom_Class.WarmUp;

import day34_Custom_Class.WarmUp.Carpet;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomCarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
//        carpets[0].customOrder(5,5,100,true);
  //      carpets[1].customOrder(2.5,15,50,false);
    //    carpets[2].customOrder(3,1.3,30,false);
      //  carpets[3].customOrder(2.5,15,70,true);
        //carpets[4].customOrder(0.5,25,15,false);
        //System.out.println(carpets[4]);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        for (Carpet eachCarpet : carpets ){
            if (eachCarpet.isPersian){
                persianCarpets.add(eachCarpet);
            }
        }
        System.out.println("===================================");
        System.out.println("there are "+persianCarpets.size()+ " persian carpets");
        System.out.println("===================================");
        System.out.println(persianCarpets.get(0).calCost());

        ArrayList<Carpet> regularCarpets= new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeAll(persianCarpets);

        regularCarpets.removeIf(p -> p.isPersian);

        System.out.println("there are "+regularCarpets.size()+" regular carpets");

        for (int i=0; i<regularCarpets.size(); i++){
            System.out.println(regularCarpets.get(i).calCost());
        }



    }
}
