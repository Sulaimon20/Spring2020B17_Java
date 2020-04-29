package day00_ReferenceQuiz;

public class exercise {
    public static void main(String[] args) {
        /*
        Write a program that can print out the unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}
            output: 2
            if arr -> {1,2,2,3,4,4}
            output:  1  3
         */
        int [] arr = {1,2,2,1, 8,3, 3,4,4};

       for (int i=0; i<arr.length; i++){
           int count = 0;
           for (int k=0; k<arr.length; k++){
               if (arr[i]==arr[k]){
                   count++;
               }
           }
           if (count==1){
               System.out.println(i);
           }
       }

       }

    }

