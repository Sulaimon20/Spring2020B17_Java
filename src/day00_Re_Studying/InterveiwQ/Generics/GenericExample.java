package day00_Re_Studying.InterveiwQ.Generics;

import java.util.ArrayList;

public class GenericExample {

    public static void main(String[] args) {


        ArrayList myList = new ArrayList();
        myList.add("d");
        myList.add(1);
        myList.add(1.2);
        myList.add('a');
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println("i = " + myList.get(i));
        }


    }


}
