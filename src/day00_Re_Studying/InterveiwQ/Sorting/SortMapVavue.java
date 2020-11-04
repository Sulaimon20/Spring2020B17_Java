package day00_Re_Studying.InterveiwQ.Sorting;

import java.util.*;

public class SortMapVavue {

    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
        map.put("Rum", 2);
        map.put("Rum", 23);
        map.put("Rum", 54);
        map.put("Rum", -6);
        System.out.println("sortByValue(map) = " + sortByValue(map));
    }

    public static Map<String, Integer> sortByValue(Map<String , Integer> map){

        List<Map.Entry<String, Integer> >list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map=new LinkedHashMap<>();

        for (Map.Entry<String,Integer> each:list){
            map.put(each.getKey(), each.getValue());
        }

        return map;
    }


}
