package day26_Method_Overloading;

import java.util.Arrays;

public class MethodOverloading2 {
    public static void main(String[] args) {
        //2,5
        System.out.println(method(3,5, 20,13));

        int [] arr1={3,2,1};
        char [] arr2={'c','b','a'};
        double[] arr3={7.3,5.5,4.3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);// same method name, different parameter
        System.out.println("============================");
    }
    public static int method(int a, int b){
        return a+b;
    }
    public static int method(int a, int b, int c){
        return a+b+c;
    }
    public static int method(int a, int b, int c, int d){
        return a+b+c+d;
    }


}
