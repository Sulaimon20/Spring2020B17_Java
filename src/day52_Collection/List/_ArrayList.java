package day52_Collection.List;

import OfficeHours._06_03_Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _ArrayList {
    public static void main(String[] args) {

        // List (interface, reference type) ==> ArrayList (Class)
        List<Integer> list1 = new ArrayList<>();//it is singly Linked list
        list1.add(1);
        ArrayList<Integer> arraylist = new ArrayList<>();//
        arraylist.add(12);

        List<Integer> list = new ArrayList<>(Arrays.asList(531, 32, 13, 4, 5, 6, 111, 1, 1));


    }
}
