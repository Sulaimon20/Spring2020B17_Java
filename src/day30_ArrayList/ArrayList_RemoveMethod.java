package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_RemoveMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3
        System.out.println(list);//[1, 2, 3, 4]

        list.remove(1);

        System.out.println(list);//[1, 3, 4]
        Integer a=3;
        boolean r1=list.remove(a);
        System.out.println(r1);//[1, 3, 4]
    }
}
