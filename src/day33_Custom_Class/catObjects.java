package day33_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {
    public static void main(String[] args) {

        Cat cat1=new Cat();
        cat1.setCatInfo("Siemes", "White", 2, "Sasha");
        System.out.println(cat1);

        Cat cat2=new Cat();
        cat2.setCatInfo("Siemes", "Beige", 7, "Cinnamon");
        System.out.println(cat2);
        Cat cat3=new Cat();
        cat3.setCatInfo("Calico", "Brown-White", 3, "Bobo");
        System.out.println(cat1);

        ArrayList<Cat> catList=new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2,cat3));
        for (int i=0; i<catList.size(); i++){
            System.out.println(catList.get(i));
        }
        System.out.println("================================");

        cat1.sleep();
        cat2.sleep();
        cat1.eat("cat treats");
        System.out.println("======================");
        cat1.drink("water");


    }
}
