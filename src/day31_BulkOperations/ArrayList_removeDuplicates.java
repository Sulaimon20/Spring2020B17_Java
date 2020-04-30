package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> str=new ArrayList<>(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer> result=new ArrayList<>();
        for (Integer each: str){
            if(!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);

    }
}
