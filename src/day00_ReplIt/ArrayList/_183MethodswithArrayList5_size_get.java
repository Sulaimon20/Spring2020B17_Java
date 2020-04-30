package day00_ReplIt.ArrayList;

import java.util.ArrayList;

public class _183MethodswithArrayList5_size_get {

    public static int sum(ArrayList<Integer> ints)
    {
        //write code here
        int sum=0;
        for(int i=0; i>ints.size(); i++){
            sum+=ints.get(i);
        }
        return sum;

    }

    public static void main(String[] args) {
        ArrayList<Integer> ints =new ArrayList<>();
        ints.add(4);

    }
}
