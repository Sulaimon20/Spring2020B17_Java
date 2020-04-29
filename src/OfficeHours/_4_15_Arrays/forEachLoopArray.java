package OfficeHours._4_15_Arrays;

public class forEachLoopArray {
    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        for ( int each : arr){
            if (each==3){
                continue;
            }
            System.out.print(each+"");// 1 2  4
        }
        System.out.println("\n==================");
        int [] arr2= {1,2,3,4,5,6,7,8,9,10};
        for (int each: arr2){
            if (each%2==0){
                System.out.print(each+" ");
            }
        }
        //int [] arr3={}


    }
}
