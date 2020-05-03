package day00_Re_Studying.InterveiwQ.Unique;

import java.util.ArrayList;

public class inuqueArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//{1,2,1}
        list.add(1);
        list.add(2);
        list.add(1);
    //to retrieve the elements we need list.get(0)==>1
        int count=0; //
        for (Integer each: list){//int is also works
            if (each==list.get(0)){// 0 1 2 how many time the list.get(0) is in each elements = frequency
                count++;
            }
        }

        System.out.println(count);//2

        ArrayList<Integer> list1 = new ArrayList<>();//{1,2,1}
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        for (int i=0; i<list.size(); i++) {
            int count1 = 0; //
            for (int each : list) {//int is also works
                if (each == list.get(0)) {// 0 1 2 how many time the list.get(0) is in each elements = frequency
                    count1++;
                }
            }
            if (count==1){
                list1.add((list.get(0)));//
            }
        }
        System.out.println(count);
    }
}
