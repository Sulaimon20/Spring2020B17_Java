package day53_Iterable_Maps;

import java.util.*;

public class Collection_Practice {
    // access-modifier, specifier, methodName(Parameter){}
    //specifiers: static, final, abstract, synchronized

    public static void main(String[] args) {
        //how to make ArrayList synchronized????

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = Collections.synchronizedList(list);//now it becomes thread-safe.

        Set<Integer> set=new HashSet<>();
        set=Collections.synchronizedSet(set);//now it becomes thread-safe.

        System.out.println("========================");

        String [] arr={"A","B", "C","D","D","E"};
        LinkedHashSet<String> str=new LinkedHashSet<>(Arrays.asList(arr));

        String [] arr2={"A","B", "C","D","D","E"};
        TreeSet<String> str1=new TreeSet<>(Arrays.asList(arr2));



    }

    public synchronized void append(){



    }
}
