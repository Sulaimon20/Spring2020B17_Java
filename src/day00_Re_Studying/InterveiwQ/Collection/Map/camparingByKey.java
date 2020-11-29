package day00_Re_Studying.InterveiwQ.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class camparingByKey {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Rahul");
        map.put(102, "Rahul");
        map.put(102, "Rahul");
        map.put(103, "As");
        map.put(102, "Rahul");
        map.put(101, "Vijay");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);

    }
}
