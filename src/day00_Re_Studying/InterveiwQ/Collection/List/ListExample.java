package day00_Re_Studying.InterveiwQ.Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();//it is singly Linked list
        list1.add(1);
        ArrayList<Integer> arraylist =new ArrayList<>();//
        arraylist.add(12);

        //List (interface, reference type) ==> LinkedList (Class)
        List<Integer>list2=new LinkedList<>();//it is doubly linked list
        list2.add(2);
        list2.get(0);
        list2.remove(0);



    }

}
