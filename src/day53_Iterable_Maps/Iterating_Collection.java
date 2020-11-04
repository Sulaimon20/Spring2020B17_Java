package day53_Iterable_Maps;

import OfficeHours._06_03_Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {
    /*
   -Iterable is an interface ==> root interface
   - classes that implements iterable, gains the ability to iterate
   the object.
   - We can apple Iterator(I) to the classes that are
   implementing Iterator
    -reason of iterating: ==>
    1: allows us to get access to the Objects
    of the Collections type
    2: is allows us to remove the objects from collection

*/

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        for (int i=0; i<list.size(); i++){
            if (list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println(list);//[1, 2, 3, 4, 4, 5, 5]

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,4,5,6,7,7));
        list2.removeIf(p -> p<4);
        System.out.println(list2);                              //[4, 4, 4, 5, 6, 7, 7]

        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1,1,2,3,4,4,4,5,6));
        Iterator<Integer> it = list3.iterator();
        it.hasNext();//boolean expression
        System.out.println(it.hasNext());//true if list3 has elements

        System.out.println(it.next());
        while (it.hasNext()){
            if(it.next()<4){
            it.remove();
            }
        }
        System.out.println(list3);//[4, 4, 4, 5, 6]

        ArrayList<Integer> list4=new ArrayList<>(Arrays.asList(11,11,22,33,44,44,44,55,66));
        //      i=0;
        for (Iterator<Integer> each=list4.iterator(); each.hasNext(); ){
            int num=each.next();
            if(num<44){
                each.remove();
            }
        }
        System.out.println(list4);//[44, 44, 44, 55, 66]



    }


}
