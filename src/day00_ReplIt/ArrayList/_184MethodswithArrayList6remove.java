package day00_ReplIt.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _184MethodswithArrayList6remove {
    public static void test(ArrayList<Double> dubs)
    {
        //write code here
        dubs.remove(0);
        dubs.remove(0);
        System.out.println(dubs);

        ArrayList<String> words=new ArrayList<>();
        words.add("hey");
        words.add("how");
        words.add("is");
        words.add("yo");
        words.add("everyone");
        words.add("doing?");
//how, hey, yo, is, everyone, doing?
        System.out.println(words);
        words.set(0, "hey");
        words.set(3, "yo");
        System.out.println(words);
//[how, hey, yo, is, everyone, doing?]

//[hey, how, is, yo, everyone, doing?]


    }

    public static void main(String[] args) {
        int [] arr={6,2,3,1,9,2,5};
        double [] darr= new double [arr.length];
        for(int i=0; i<arr.length; i++) {
            darr[i] = arr[i];
        }
         ArrayList<Double> dubs=new ArrayList<>();
            for(int i=0; i<darr.length; i++) {
                dubs.add(darr[i]);
            }
        System.out.println(dubs);
            test(dubs);

}
}
