package day00_ReplIt.Methods;

import java.util.Scanner;

public class _145_Methods_plus_minus_Void {

    public static void plus_minus(int []arr){
        int positive=0;
        int negative=0;
        int zero=0;
        for (int each:arr){
            if (each>0){
                positive++;
            }else if (each<0){
                negative++;
            }else{
                zero++;
            }
        }
        System.out.println("positives:"+positive+", negatives:"+negative+", zeros:"+zero);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {
            arr[i]=inp.nextInt();
        }
        plus_minus(arr);
    }//end main
}