package day53_Iterable_Maps;

import OfficeHours._06_03_Array.Array;

import java.util.*;

public class Iterating_Collection2 {


    public static void main(String[] args) {

        LinkedHashSet<String>names=new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ivan", "Alex", "Sasha", "Roma", "Roma","Roma","Pasha", "Stepa", "Vasya","Stepa", "Vasya"));
        System.out.println(names);


        Iterator<String> it=names.iterator();

        while (it.hasNext()){
            String str=it.next();
            if (str.toLowerCase().contains("m")){
                it.remove();
            }

        }
        System.out.println(names);


        LinkedHashSet<String>students=new LinkedHashSet<>();
        students.addAll(Arrays.asList("Ivan", "Alex", "Sasha", "Roma", "Roma","Roma","Pasha", "Stepa", "Vasya","Stepa", "Vasya"));
        System.out.println(students);
        //Iterator<String> it2=students.iterator();
        for (Iterator<String> I=students.iterator(); I.hasNext() ;  ){
            String str1=I.next();
            if (str1.contains("R")||str1.contains("r")){
                I.remove();
            }
        }
        System.out.println(students);

        LinkedHashSet<String>names2=new LinkedHashSet<>();
        names2.addAll(Arrays.asList("Roza", "Tima", "Pavel", "Tom", "William","Stepa", "Vasya","Stepa", "Vasya"));
        System.out.println(names2);

        names2.removeIf(p-> p.contains("P")||p.contains("p"));//[Roza, Tima, Tom, William, Vasya]
        //names2.retainAll()  <== this is the opposite of remove
        names2.retainAll(Arrays.asList("Tom", "Tima"));//[Tima, Tom]
        System.out.println(names2);



        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));
        //verify
        boolean b=list.containsAll(Arrays.asList(5,6,7,8));
        System.out.println(b);


    }

}
