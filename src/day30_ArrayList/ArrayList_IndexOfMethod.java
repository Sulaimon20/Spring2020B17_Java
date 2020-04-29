package day30_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3

        Integer x= list.indexOf(3);
        System.out.println(x);//2
        Integer x1= list.indexOf(300);
        System.out.println(x1);//-1 not exist in this arraylist


    }
}
