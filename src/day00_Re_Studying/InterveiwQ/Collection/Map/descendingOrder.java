package day00_Re_Studying.InterveiwQ.Collection.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class descendingOrder {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Washington DC");
        map.put(101,"Paris");
        map.put(102,"London");
        map.put(103,"Sydney");
        map.put(104,"Moscow");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}
