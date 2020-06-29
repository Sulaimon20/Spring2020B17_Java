package day54_Maps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps_Practice {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

        for( String eachKey   : students.keySet()  ){
            int eachValue = students.get(eachKey);  // score

            if( eachValue < 90){
                badStudents.put(eachKey, eachValue );
            }else{
                goodStudents.put(eachKey, eachValue );
            }
        }


        System.out.println(badStudents);
        System.out.println(goodStudents);



    }
}