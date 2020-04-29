package day30_ArrayList.WarmUp;

import java.util.ArrayList;

public class uniqueElementsArrayList {
    public static void main(String[] args) {
        int [] arr={1,1,2,3,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer j=0; j<list.size(); j++){
            int count=0;
            for (Integer i=0; i<list.size(); i++){
                if (list.get(i)==list.get(j)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(list.get(j));
            }
        }

/*
write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}

 */

    }
}
