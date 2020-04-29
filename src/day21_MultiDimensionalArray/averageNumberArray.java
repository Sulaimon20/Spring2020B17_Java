package day21_MultiDimensionalArray;

public class averageNumberArray {
    public static void main(String[] args) {

        int [] arr={10,20,30,40,50};
        // average: sum of all numbers / length (total numbers)
        int length=arr.length; // total number of the elements
        int sum=0;
        for (int i=0; i<arr.length; i++){
            int eachNum=arr[i];
            sum+=eachNum;
        }
        System.out.println(sum/length);
    }
}//below you have another way to solve this problem
/*
int a[] = {1,2,3};
        int nunbers = 3;
        int sum  = 0;

        for(int i=0; i<nunbers; i++) {
            sum += a[i];
        }
        System.out.println(sum/nunbers);

 */