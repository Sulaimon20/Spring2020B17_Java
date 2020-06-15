package day00_ReplIt.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class ArrListRemoveInstances {

    public static ArrayList<Integer> removeInst(ArrayList<Integer> arr,Integer n) {


                arr.removeAll(Arrays.asList(n));//[1, 2, 3,4]


        return arr;


    }

    public static void main(String[] args)
    {
        ArrayList<Integer>  arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1,1,2,3,1,4};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,1));


    }//end main
}







