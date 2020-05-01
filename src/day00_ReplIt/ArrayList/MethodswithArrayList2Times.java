package day00_ReplIt.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodswithArrayList2Times {

    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,5,3,7));
    }
    //create your method below
    public static ArrayList<Integer> list(ArrayList<Integer> list){

        ArrayList<Integer>list1=new ArrayList<>();
        for (int i=0; i<list.size();i++){
            list1.add(list.get(i));
            list1.add(list.get(i));
        }

        return list1;

    }

}
