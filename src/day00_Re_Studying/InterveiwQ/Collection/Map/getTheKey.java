package day00_Re_Studying.InterveiwQ.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class getTheKey {

    public static void main(String[] args) {

        Map <String, String > map1=new HashMap<>();
        map1.put("USA", "DC");
        map1.put("UK", "London");
        map1.put("UK", "London");
        map1.put("UK", "London");
        map1.put("France", "Paris");

        for (String each: map1.values()) {
            System.out.println("each = " + each);//each = DC; each = London; each = Paris
        }
        for (String each: map1.keySet()) {
            System.out.println("each = " + each);//each = USA; each = UK; each = France
        }

    }
}
