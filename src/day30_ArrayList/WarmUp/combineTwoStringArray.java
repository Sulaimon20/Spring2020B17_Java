package day30_ArrayList.WarmUp;

import java.util.ArrayList;

public class combineTwoStringArray {
    public static void main(String[] args) {
        String[]arr1 = {"A", "B", "C"};
        String[]arr2 ={"D", "E", "F", "G"};
//method1
        ArrayList<String> list=new ArrayList<>();

        for(String each:arr1){
            list.add(each);
        }
        for (String e:arr2){
            list.add(e);
        }
        System.out.println(list);
//      method2
        String [] ara1 = {"A", "B", "C"};
        String [] ara2 = {"D", "E", "F", "G"};
        ArrayList<String> list1 = new ArrayList<>();
        for (int i =0; i < ara1.length; i++){
            list1.add(ara1[i]);
        }
        for (int k =0; k < ara2.length; k++){
            list1.add(ara2[k]);
        }
        System.out.println(list1);


    }
}
