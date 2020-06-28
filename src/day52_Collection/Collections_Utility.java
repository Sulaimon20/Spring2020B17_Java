package day52_Collection;
import day52_Collection.Set.TreeSet;

import java.util.*;

public class Collections_Utility {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Collections.sort(list1);
    ArrayList<Integer> num=new ArrayList<>(Arrays.asList(1,2,3,2,5,6,2,1,1,1,6));

    //TreeSet<Integer> sorted=new TreeSet<>(num);
    //System.out.println(sorted);//[1, 2, 3, 5, 6]

        System.out.println(num);//[1, 2, 3, 2, 5, 6, 2, 1, 1, 1, 6]
    //num=new ArrayList<>(sorted);

    //short way
    //num=new ArrayList<>(new day52_Collection.Set.TreeSet<>(num));
    //System.out.println(num);

    ArrayList<Character> unique=new ArrayList<>(Arrays.asList('A','A','A','A','A','B','C','D'));
   // unique=new ArrayList<>(new day52_Collection.Set.TreeSet<>(unique));//[A, B, C, D]
    System.out.println(unique);//[A, B, C, D]

    ArrayList<Integer>num2=new ArrayList<>(Arrays.asList(6,6,6,6,6,6,6,5,5,5,5,5,4,4,4));

    num2=new ArrayList<>(new LinkedHashSet<>(num2));//[6, 5, 4] <== the order is as it was, dublicate removed
    System.out.println(num2);

    System.out.println("========================================");

        ArrayList<String>letters=new ArrayList<>();
        letters.addAll(Arrays.asList("A","A","B","B","C","D"));
        boolean result=Collections.frequency(letters, "A")==1;
        System.out.println(result);

        String str="cybertek";
        System.out.println(new LinkedHashSet<>(new ArrayList<>(Arrays.asList(str.split("")))));

        new LinkedHashSet<>(new ArrayList<>(Arrays.asList(str.split(""))));

        ArrayList<String> letters1 = new ArrayList<>();
        letters1.addAll(Arrays.asList("aa","bb","cc","cc","bb"));
        //letters1=new ArrayList<>(new TreeSet<>(letters1));
        System.out.println(letters1);
















    }
}
