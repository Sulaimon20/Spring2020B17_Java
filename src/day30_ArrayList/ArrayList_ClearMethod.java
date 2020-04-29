package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_ClearMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3
        list.clear();
        System.out.println(list);//[]
    }
}
