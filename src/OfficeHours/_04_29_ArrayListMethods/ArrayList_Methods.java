package OfficeHours._04_29_ArrayListMethods;

import java.util.ArrayList;

public class ArrayList_Methods {

        /*
        add(), get(), size(), set(), remove(), clear(), indexOf(), LastIndexOf()
         */
        public static void main(String[] args) {

            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(20);
            list.add(1,30);

            System.out.println(list);//[1, 30, 20]
            System.out.println(list.size());//3
            //to count the sum inside the ArrayList

            Integer a=0;
            for (int i=0; i<list.size(); i++){
                    a+=list.get(i);
            }
            System.out.println(a);


    }
}
