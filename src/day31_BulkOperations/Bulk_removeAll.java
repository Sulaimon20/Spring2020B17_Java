package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>(Arrays.asList("AABBCC"));
        System.out.println("1) "+str);//[AABBCC]
//to get the data from AL, 1) new String to store, 2) we need for loop and 3) get method
        String str1="";
        for (int i=0; i<str.size();i++){//
            str1+=(str.get(i));
        }
        System.out.println("2) "+str1);//AABBCC

        String result="";
        for (int i=0; i<str1.length(); i++) { // 0,1,2,3
            if(result.contains(""+str1.charAt(i) )) {
                continue;//if contains, =>skip
            }
            result += str1.charAt(i);//the rest, store in the String result
        }
        System.out.println("3) "+result);//ABC


        ArrayList<Integer> str2=new ArrayList<>(Arrays.asList(1,2,3,3,3,3,3,4,5,6,7,8,9));
        System.out.println("4) "+str2);//[1, 2, 3, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9]
        str2.removeAll(Arrays.asList(3));//remove all 3
        System.out.println("5) "+str2);//[1, 2, 4, 5, 6, 7, 8, 9]


        String [] names={"Anna", "Aroan", "Daniel", "Tom"};
        ArrayList<String> names2=new ArrayList<>(Arrays.asList(names));
        System.out.println("6) "+names2);//[Anna, Aroan, Daniel, Tom]
        names2.removeAll(Arrays.asList("Anna"));
        System.out.println("7) "+names2);//[Aroan, Daniel, Tom]




    }
}
