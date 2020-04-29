package day22_Arras_Loops;

public class nestedForEachArray2 {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}};
        int countOdd=0;
        int sumofOdd=0;
        int sumofEven=0;
        for (int [] each1DArray : numbers){
            for (int eachElement :each1DArray ){
                if (eachElement%2==0){
                    System.out.print(eachElement+" ");
                    sumofEven+=eachElement;
                }else {
                    sumofOdd+=eachElement;
                    countOdd++;
                }
            }
        }
        System.out.println();
        System.out.println(countOdd);
        System.out.println("Sum of even numbers: "+sumofEven);
        System.out.println("Sum of odd numbers: "+sumofOdd);
        System.out.println("========================================");
    }
}
