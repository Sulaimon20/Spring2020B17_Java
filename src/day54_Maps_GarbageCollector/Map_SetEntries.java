package day54_Maps_GarbageCollector;
import java.util.*;

public class Map_SetEntries {

    public static void main(String[] args) {
       //I gonna use LinkedHashMap
        //then for loop
        //inside the loop i will use if condition:
        //getValue


        LinkedHashMap<String, String>  fb = new LinkedHashMap<>();
        fb.put("Tester01", "password1");
        fb.put("Tester02", "password1");
        fb.put("Tester02", "password2");
        fb.put("Tester03", "password3");
        fb.put("Tester04", "password4");
        fb.put("Tester05", "password5");

        System.out.println(fb);

        System.out.println("======================================");

        for( String  eachKey   :  fb.keySet() ){
            //  System.out.println(eachKey +"  " +fb.get(eachKey));
            System.out.println(eachKey);
        }
        List<String> usernames = new ArrayList<>(fb.keySet());
        System.out.println(usernames);

        System.out.println("=======================================");

        for(String eachValue : fb.values()){
            System.out.println(eachValue);
        }

        List<String> passwords = new ArrayList<>(fb.values());
        System.out.println(passwords);

        System.out.println("=======================================");



        Map<Integer, String> map=new TreeMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(2,"two");
        map.put(2,"two");
        map.put(2,"two");
        map.put(3,"three");
        map.put(3,"three");
        map.put(3,"three");
        map.put(4,"four");
        map.put(4,"four");
        map.put(4,"four");
        map.put(4,"four");


        System.out.println(map);
    }
    }

