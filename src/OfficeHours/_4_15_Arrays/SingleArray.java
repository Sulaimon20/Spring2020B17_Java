package OfficeHours._4_15_Arrays;

import java.util.Arrays;

public class SingleArray {
    public static void main(String[] args) {
        int a=100;
        int [] arr={100,200,300};
        //           0   1   2

        for (int i=0; i<3; i++){

            int num =arr[i];
            System.out.println(num);
        }
        System.out.println("=====================================");
        int j=0;
        while (j<3){
            int num =arr[j];
            System.out.println(num);
            j++;
        }
        System.out.println("===========================================");
        String[]names={"James", "Aaron", "Luoise"};
        int length=names.length;
        String [] namesRes=new String [length];// 0 0 0 we create new arrays
        //variable   i        k
            namesRes[0]=names[2];
            namesRes[1]=names[1];
            namesRes[2]=names[0];
            int k=2;
            for(int i=0; i<length; i++){
                namesRes[i]=names[k];
                k--;
            }
        System.out.println(Arrays.toString(namesRes));
    }
}
