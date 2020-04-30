package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>(Arrays.asList("AABBCC"));
        System.out.println(str);//[AABBCC]

        String str1="";
        for (int i=0; i<str.size();i++){
            str1+=(str.get(i));
        }
        System.out.println(str1);

        String result="";
        for (int i=0; i<str1.length(); i++) { // 0,1,2,3
            if(result.contains(""+str1.charAt(i) )) {
                continue;
            }
            result += str1.charAt(i);
        }
        System.out.println(result);


        ArrayList<Integer> str2=new ArrayList<>(Arrays.asList(1,2,3,3,3,3,3,4,5,6,7,8,9));
        System.out.println(str2);
        str2.removeAll(Arrays.asList(3));
        System.out.println(str2);


        String [] names={"Anna", "Aroan", "Daniel", "Tom"};
        ArrayList<String> names2=new ArrayList<>(Arrays.asList(names));
        System.out.println(names2);//[Anna, Aroan, Daniel, Tom]
        names2.removeAll(Arrays.asList("Anna"));
        System.out.println(names2);//[Aroan, Daniel, Tom]




    }
}
