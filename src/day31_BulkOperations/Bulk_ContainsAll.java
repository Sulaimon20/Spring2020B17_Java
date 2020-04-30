package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {
    public static void main(String[] args) {

//10, 20,40, 60 if all objects are exists in ArrayList===>true
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        boolean r1=(list.contains(10));
        boolean r2=(list.contains(20));
        boolean r3=(list.contains(60));
        boolean result= r1==true && r2==true && r3==true;
        System.out.println(result);//false

        boolean r4=list.containsAll(Arrays.asList(10,20,60));
        System.out.println(r4);

        //10,20,30

        Double[] data={10.0,20.0,30.0};
        System.out.println(list.containsAll(Arrays.asList(data)));//false
        System.out.println(list.containsAll(Arrays.asList(1,2,3,4,5)));//false

    }
}
