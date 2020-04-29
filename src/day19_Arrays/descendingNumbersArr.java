package day19_Arrays;

import java.util.Arrays;

public class descendingNumbersArr {
    public static void main(String[] args) {
        int [] arr={3,4,1,123,-422, 200,55};
//decending
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");//55 200 -422 123 1 4 3
        }

        Arrays.sort(arr);
        System.out.println("\n"+Arrays.toString(arr));//[-422, 1, 3, 4, 55, 123, 200]
    }
}
