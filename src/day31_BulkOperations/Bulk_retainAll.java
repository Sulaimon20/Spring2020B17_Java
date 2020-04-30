package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_retainAll {
    public static void main(String[] args) {
        // retain all = keep all


        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3));

        list.retainAll(Arrays.asList(1,2,3,4,5));

        System.out.println(list);



    }
}
