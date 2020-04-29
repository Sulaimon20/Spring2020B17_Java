package day27_DayTime;

import java.util.Arrays;

public class MinFromArrayNotSort {
    public static void main(String[] args) {
       // int [] arr={5,4,7,5};
       // minNum(arr);

        double [] arr={5.0,0.4,7.4,5.9};

        System.out.println(minNum(arr));
        System.out.println(maxNum(arr));
    }
    public static int minNum(int [] arr){
    int minimum=arr[0];

    for (int each : arr){// each: 5,4,7,5

        if (each<minimum){ // we compare the min with each
            minimum=each;
        }
    }
    return minimum;

}
    public static double minNum(double [] arr){
        double minimum=arr[0];

        for (double each : arr){// each: 5,4,7,5

            if (each<minimum){ // we compare the min with each
                minimum=each;
            }
        }
        return minimum;

    }
    public static int maxNum(int [] arr){
        int minimum=arr[0];

        for (int each : arr){// each: 5,4,7,5

            if (each>minimum){ // we compare the min with each
                minimum=each;
            }
        }
        return minimum;

    }
    public static double maxNum(double [] arr){
        double minimum=arr[0];

        for (double each : arr){// each: 5,4,7,5

            if (each>minimum){ // we compare the min with each
                minimum=each;
            }
        }
        return minimum;

    }
}
