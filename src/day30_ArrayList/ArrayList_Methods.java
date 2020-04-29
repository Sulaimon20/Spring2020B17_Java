package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        System.out.println(list);//[5, 7, 8]
        list.add(1,6);
        System.out.println(list);//[5, 6, 7, 8]
        list.add(list.size()-1,6);
        System.out.println(list);//[5, 6, 7, 6, 8]
    }
}
