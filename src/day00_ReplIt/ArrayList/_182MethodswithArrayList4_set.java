package day00_ReplIt.ArrayList;

import java.util.ArrayList;

public class _182MethodswithArrayList4_set {
    public static void test(ArrayList<String> words)
    {
        //write code here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(8);
        nums.add(1);
        nums.add(-1);
        words.set(2,"99");
        words.set(2,"100");
        System.out.println(nums);

    }
    public static void main (String[]args){
        ArrayList<String> words=new ArrayList<>();
                words.add("99");
                words.add("100");
        test(words);
    }

}
