package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_StringMethods {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.remove(1);
        System.out.println(list);

        boolean ar=list.remove("C");
        System.out.println(ar);
    }
}
