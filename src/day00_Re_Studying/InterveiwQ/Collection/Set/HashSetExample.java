package day00_Re_Studying.InterveiwQ.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {


        Set<String> names=new HashSet<>();//HashSet will remove the duplicate, but disordered it
        names.add("Anna");
        names.add("Anna");
        names.add("Radik");
        names.add("Alex");
        names.add("David");
        System.out.println(names.iterator().next());//Alex
        
        System.out.println(names);//[Alex, Radik, David, Anna]
    }

}
