package day00_Re_Studying.InterveiwQ.DuplicateNonDuplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class removeDuplWithLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,4,2,4,8));
        Predicate<Integer> nonDup= p -> Collections.frequency(list,p)!=1;//
        list.removeIf(nonDup);
        System.out.println(list);


    }
}
