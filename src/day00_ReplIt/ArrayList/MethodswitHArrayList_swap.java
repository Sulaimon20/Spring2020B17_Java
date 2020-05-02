package day00_ReplIt.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MethodswitHArrayList_swap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2)
    {
        ArrayList<String> swap = new ArrayList<>(list);
        Collections.swap(swap,pos1,pos2);

        return swap;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));

        int pos1=0;
        int pos2=2;
        ArrayList<String> swap = new ArrayList<>(list);
        Collections.swap(swap,pos1,pos2);

        System.out.println(swap);;
    }
}
