package OfficeHours.Practice_04_29_ArrayListMethods;

import java.util.ArrayList;

public class ArrayList_String {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(2,"E");
        System.out.println(list);

        ArrayList<Integer> list2=new ArrayList<>();
        for (int i=0; i<=8;i++){
            list2.add(i);
        }
        System.out.println(list2);





    }
}
