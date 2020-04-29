package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_set {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(1,"C");
        list.add(1,"D");
        System.out.println(list);//[A, D, C, B]

        list.set(3,"F");
        System.out.println(list);//[A, D, C, F]

        list.set(2,"E");
        System.out.println(list);//[A, D, E, F]



    }
}
