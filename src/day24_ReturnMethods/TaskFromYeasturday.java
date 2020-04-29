package day24_ReturnMethods;

import java.util.Arrays;

public class TaskFromYeasturday {
    public static void main(String[] args) {
        int []arr={10,8,9,54,3,2,1};
        MaxNumber(arr);
        MinNumber(arr);



    }
    public static void MaxNumber(int [] array){
        Arrays.sort(array);// ascending order
        System.out.println(array[array.length-1]);
    }
    public static void MinNumber(int [] array){
        Arrays.sort(array);// ascending order
        System.out.println(array[0]);
    }
    public static void Descending(int [] array){

        Arrays.sort(array);// ascending order
        for (int i=array.length-1; i>=0; i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }

}
