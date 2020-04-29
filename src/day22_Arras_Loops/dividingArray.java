package day22_Arras_Loops;

public class dividingArray {
    public static void main(String[] args) {
        int arr1[]={8,4,6,8,4};
        int arr2[]={8,4,6,8,4};

        for (int x =0;x <arr1.length;x++){//we count each elements in the Array
            int result = arr1[x] / 2; //4 2 3 4 2
            System.out.println("for "+arr1[x]+" the result is "+result);
        }


    }
}
