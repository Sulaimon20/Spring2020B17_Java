package day30_ArrayList;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list.contains("D"));
        System.out.println(list.contains("Z"));
    }
}
