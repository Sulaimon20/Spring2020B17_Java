package day00_Re_Studying.InterveiwQ.DuplicateNonDuplicate;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Duplicates {
    public static void main(String[] args) {

        /*
        ArrayList<String> str=new ArrayList<>(Arrays.asList("AABBCC"));
        System.out.println(str);//[AABBCC]
        ArrayList<String> str2=new ArrayList<>();

        for (int i=0; i<str.size(); i++){
            if(!str.contains(str[i])){
                str2.add(str[i]);
            }
        }

*/



        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(1,1,2,2,3,3));
        ArrayList<Integer> result=new ArrayList<>();//empty, [] we gonna store here the numbers

        for (Integer each: num){
            if(!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);


        Integer [] arr12={1,1,2,2,3,3};
        ArrayList<Integer> num1=new ArrayList<>(Arrays.asList(arr12));
        ArrayList<Integer> result2=new ArrayList<>();//empty, [] we gonna store here the numbers

        for (Integer each: num1){
            if(!result2.contains(each)){
                result2.add(each);
            }
        }
        System.out.println(result2);




        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,1,2,2,3,3));
        ArrayList<Integer> nonDup=new ArrayList<>();//empty, [] we gonna store here the numbers
        for (int i=0; i<numbers.size();i++){
            if (!nonDup.contains(numbers.get(i))){
                nonDup.add(numbers.get(i));
            }
        }
        System.out.println(nonDup);







    }
}
