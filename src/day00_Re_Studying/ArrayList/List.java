package day00_Re_Studying.ArrayList;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(1000);
        list.add(1.2345);
        list.add(false);
        list.add(true);
        System.out.println(list);//[Hello, 1000, 1.2345, false, true]
        String allValues=list.toString();
        System.out.println(allValues);//[Hello, 1000, 1.2345, false, true]
        Integer item=(Integer) list.get(1);
        System.out.println(item);
    }

}
