package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicatesCollection {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>(Arrays.asList("A", "B","A", "C", "D","D"));
        ArrayList<String> result = new ArrayList<>();
        for (int i=0; i<list1.size(); i++) {
            int count = Collections.frequency(list1, list1.get(i));
            if (count > 1&&!result.contains(list1.get(i))) {
                result.add(list1.get(i));
            }
        }
        System.out.println(result);


        String [] StringArr = {"owl","eagle","goldfish", "eagle","goldfish","goldfish",  "eagle"};
        ArrayList list = new ArrayList<>(Arrays.asList(StringArr));
        ArrayList unique = new ArrayList();
        for(int i =0; i<list.size();i++){
            if(!unique.contains(list.get(i))){
                unique.add(list.get(i));
            }
        }
        System.out.println("unique = " + unique);

        ArrayList list2 = new ArrayList();
        for(int i =0; i<unique.size();i++){
            int count =0;
            for( int j=0; j<list.size();j++){
                if(unique.get(i)== list.get(j)){
                    count++;
                }
            }
            if(count>1){
                list2.add(unique.get(i));
            }
        }
        Collections.sort(list2);
        System.out.println(list2.remove(0));

    }
}
