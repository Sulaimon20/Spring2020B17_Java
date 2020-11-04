package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLambda {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList(Arrays.asList(1,2,3,4,5,6));

        list.forEach(n-> System.out.print(n));

        System.out.println("");

        ArrayList<Integer> list2=new ArrayList(Arrays.asList(1,2,3,4,5,6));
        list2.forEach( a->{ if ( a%2==0 ) System.out.print(a); } );




    }

}
