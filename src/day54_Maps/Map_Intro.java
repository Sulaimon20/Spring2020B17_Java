package day54_Maps;

import java.time.LocalDate;
import java.util.*;

public class Map_Intro {
    public static void main(String[] args) {
//Map is dynamic, accept only objects
//Accepts two Objects in the same time

        Map<String,Integer> employee=new HashMap<>();
        employee.put("Developer",100000);
        employee.put("QA", 900000);

        System.out.println(employee+" "+employee.size());//{Developer=100000} 1
        System.out.println(employee.get("Developer"));//100000
        System.out.println(employee.size());//2 objects


        Map<String,Integer> employee1=new Hashtable<>();
        employee1.put("SDET",120000);
        Map<String,Integer> employee2=new TreeMap<>();

        employee2.put("PO",200000);
        employee2.put("PO",100000);
        employee2.put("PO",300000);//the gonna be accepted, the others gonna removed
        System.out.println(employee2+" TreeSet does not accept duplacate");
        System.out.println(employee2.remove("PO",100000));//false

        System.out.println(employee1);

        Map<String, LocalDate> friend=new HashMap<>();
        friend.put("Todd", LocalDate.of(1995, 12,2));

}
}
