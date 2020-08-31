package day00_Re_Studying.InterveiwQ.Sorting;

import OfficeHours.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListSort {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,1,45,23,6,4,3,3,3));
        int i=list.size();

        boolean bol = i ==list.stream().distinct().collect(Collectors.toList()).size();
        System.out.println(bol);
        System.out.println(list.stream().distinct().collect(Collectors.toList()));


    }
}
