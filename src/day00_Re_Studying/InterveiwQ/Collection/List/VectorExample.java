package day00_Re_Studying.InterveiwQ.Collection.List;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<Integer> vector1 =new Vector<>();//the difference ==> synchronized
        vector1.add(12);
        vector1.add(87);
        vector1.add(1);
        vector1.add(182);
        System.out.println("vector1 = " + vector1);
       vector1.remove(1);
        System.out.println("vector1 = " + vector1);







    }

}
