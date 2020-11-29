package day00_Re_Studying.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(Arrays.asList("Hello", 1000, 1.2, 'F', false));

        System.out.println(list);//[Hello, 1000, 1.2345, false, true]
        String allValues = list.toString();

        System.out.println(allValues);//[Hello, 1000, 1.2345, false, true]
        Integer item = (Integer) list.get(1);

        System.out.println(item);
    }

}
