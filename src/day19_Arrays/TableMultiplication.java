package day19_Arrays;

public class TableMultiplication {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int [] arr2={1,2,3,4,5,6,7,8,9};
        int result=0;
        int result2=0;
        for (int i=0; i<arr.length; i++)
        {
            for (int k=0;k<arr2.length; k++){
                System.out.println(arr[i]+" x "+arr2[k]+" = "+arr[i]*arr2[k]);
            }
            System.out.println("");
        }

    }
}
