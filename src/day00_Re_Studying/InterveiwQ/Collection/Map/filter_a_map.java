package day00_Re_Studying.InterveiwQ.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class filter_a_map {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "ABC");
        map1.put(2, "XCB");
        map1.put(3, "ABB");
        map1.put(4, "ZIO");

        Map<Integer, String> result = map1.entrySet()
                .stream()
                .filter(p -> p.getKey().intValue() <= 2) //filter by key
                .filter(p -> p.getValue().startsWith("A")) //filter by value
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        System.out.println( result); //{1=ABC}


        Map<String, Integer> map2 = new HashMap<>();
        map2.put("One", 1);
        map2.put("Two", 2);
        map2.put("Three", 3);

        map2.keySet().removeAll(
                map2.entrySet().stream()
                        .filter(a->a.getValue().equals(2))
                        .map(e -> e.getKey()).collect(Collectors.toList()));

        System.out.println(map2); // {One=1, Three=3}



    }

}
