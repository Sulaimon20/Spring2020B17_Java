package OfficeHours._4_15_Arrays;

public class uniqieNumber {
    /*     Write a program that can print out the unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}// we gonna look to find the unique value
            output: 2
            if arr -> {1,2,2,3,4,4}
            output:  1  3
     */
    public static void main(String[] args) {
        //      k=  1 1 2 3 3
        int [] num={1,1,2,3,3};// 2 is the only unique number
        //      i=  0 1 2 3 4  <=== these are index of the array
        int [] num2={1,2,2,3,4,4};

        for (int i = 0; i < num.length; i++) {//loop started
            // 0..4    0..4 < 4       0..4 +1  loop get continued
            int count =0;//we store in here the unique number loop get continued
            for (int k=0; k<num.length; k++) { //
                   if (num[i] == num[k]) {
                       count++;
                   }
               }
                if (count==1){
                     System.out.println(num[i]);
                   }
             }
        }
    }


