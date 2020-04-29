package day22_Arras_Loops;

public class nestedLoopArray3 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}};
        // print all the even numbers
        int oddNum=0;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i]%2==0){
                    System.out.print(numbers[j][i] + " ");
                }else {
                    oddNum++;
                }
            }
        }
        System.out.println();
        System.out.println(oddNum);

            // count odd numbers and return the total number


    }
}
