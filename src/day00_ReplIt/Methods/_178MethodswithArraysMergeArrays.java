package day00_ReplIt.Methods;

import java.util.Arrays;

public class _178MethodswithArraysMergeArrays {
    public static int[] mergR(int[] a,int[] b) {

    int [] ab=new int [a.length+b.length];

        for (int i=0; i<a.length; i++){
            ab[i]=a[i];}

        for (int i=0; i<b.length; i++){
            ab[a.length+i]=b[i];
        }
        return ab;

    }//end mergR

    public static void main(String[] args)
    {
        int[] a={1,2,3};
        int[] b={4,5,6};
        System.out.println(Arrays.toString(mergR(a,b)));
    }
}
