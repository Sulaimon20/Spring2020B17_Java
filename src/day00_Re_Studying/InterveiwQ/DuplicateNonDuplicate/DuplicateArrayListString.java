package day00_Re_Studying.InterveiwQ.DuplicateNonDuplicate;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateArrayListString {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println("original " +list);
        ArrayList<String> list2=new ArrayList<>();
        for(String each:list){
            if(list2.contains(each)){
                list2.remove(each);

            }
        }
        System.out.println(list2);




    }
}
/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */