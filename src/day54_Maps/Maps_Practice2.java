package day54_Maps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps_Practice2 {
    public static void main(String[] args) {
        LinkedHashMap<String, LocalDate> classMates = new LinkedHashMap<>();
        classMates.put("Abba", LocalDate.of(1990, 12, 05));
        classMates.put("Sharif", LocalDate.of(1996, 2, 10));
        classMates.put("Doc", LocalDate.of(1976, 1, 28));
        classMates.put("Tim", LocalDate.of(1980, 7, 15));
        classMates.put("Wallis", LocalDate.of(1989, 10, 23));
        System.out.println(classMates);
        System.out.println(classMates.containsValue("Muhtar"));//false ==> boolean to look for value if it there or not
        System.out.println(classMates.containsValue(LocalDate.of(1999,4,5)));//false
        System.out.println(classMates.keySet());//[Abba, Sharif, Doc, Tim, Wallis]
        System.out.println(classMates.entrySet());//[Abba=1990-12-05, Sharif=1996-02-10, Doc=1976-01-28, Tim=1980-07-15, Wallis=1989-10-23]
        System.out.println(classMates.values());//{Abba=1990-12-05, Doc=1976-01-28, Sharif=1996-02-10, Tim=1980-07-15, Wallis=1989-10-23}

        TreeMap<String, LocalDate> classMates1 = new TreeMap<>();
        classMates1.put("Abba", LocalDate.of(1990, 12, 05));
        classMates1.put("Sharif", LocalDate.of(1996, 2, 10));
        classMates1.put("Doc", LocalDate.of(1976, 1, 28));
        classMates1.put("Tim", LocalDate.of(1980, 7, 15));
        classMates1.put("Wallis", LocalDate.of(1989, 10, 23));
        System.out.println(classMates1);
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.of(1999, 12, 23));





    }
}