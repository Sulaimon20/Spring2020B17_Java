package day30_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEquals {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");


        ArrayList<String> list2=new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");
        System.out.println(list.equals(list2));//false

        Collections.sort(list);
        Collections.sort(list2);
        System.out.println(list.equals(list2));//true
        ArrayList<String> list3=new ArrayList<>();

        ArrayList<Integer> list4=new ArrayList<>();
        list4.add(10);
        list4.add(100);
        list4.add(10000);
        list4.add(20);
        System.out.println(list4);//[10, 100, 10000, 20]
        Collections.sort(list4);
        System.out.println(list4);//[10, 20, 100, 10000]

        ArrayList<Integer> reverse=new ArrayList<>();
        for (int i=list4.size()-1; i>=0; i--){
            //System.out.print(list4.get(i)+" ");;//10000 100 20 10
            reverse.add(list4.get(i));
        }
        System.out.println(reverse);//[10000, 100, 20, 10]




    }
}
