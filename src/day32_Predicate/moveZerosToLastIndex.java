package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moveZerosToLastIndex {
    public static void main(String[] args) {
//METHOD 1
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        //output: [1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println(list);
        Collections.swap(list, 1, 2);
        Collections.swap(list, 3, 4);
        Collections.swap(list, 3, 2);
        Collections.swap(list, 4, 6);
        Collections.swap(list, 4, 3);
        System.out.println(list);
//METHOD 2
        ArrayList<Integer> list2=new ArrayList<>((Arrays.asList(1,0,2,0,3,0,4,0)));
        for (int i=0; i<list2.size();i++){
            if (list2.get(i).equals(0)){
                list2.remove(list2.get(i));//[1, 2, 3, 4]
                list2.add(0);//[1, 2, 3, 4, 0, 0, 0, 0]
            }
        }
        System.out.println(list2);
        System.out.println("=================================================================");

        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        //we gonna count zero = which is 4//the frequency of 0

        System.out.println(list3);
        int count =0;
        for (Integer each: list3){
            if (each==0){
                count++;
                }
        }
        //we gonna remove all zero from ArrayList

        list3.removeAll(Arrays.asList(0));

        //we gonna add all the numbers to the ArrayList

        for (int i=0; i<count; i++) {
            list3.add(0);
        }
        System.out.println(list3);



    }
    }

/*
Write a program that can move all the zeros to  last indexes of ArrayList
        Ex:
            list:  {1, 0, 2, 0, 3, 0, 4, 0};
            output: [1, 2, 3, 4, 0, 0, 0, 0]
            DO NOT USE SORT method, DO NOT declare any extra arrayList

 */