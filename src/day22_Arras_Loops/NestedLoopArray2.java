package day22_Arras_Loops;

public class NestedLoopArray2 {
    public static void main(String[] args) {
        //             i=   0  1  2    0    0  1  2  3  4 5
        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
        //           j =        0       1           2
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                System.out.print(numbers[j][i]+" ");
            }

        }
        System.out.println("==========================================================");

//                        i=   0  1  2    0    0  1  2  3  4 5
        // int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1,0}};
        //           k =        0       1           2
        // 5 4 3 2 1 0 6 9 8 7
        for (int k=numbers.length-1; k>=0; k--){
            for (int i = 0; i <numbers[k].length; i++){
                System.out.print(numbers[k][i]+" ");
            }
        }
        System.out.println("======================================");



    }
}
/*
//             i=   0  1  2    0    0  1  2  3  4 5
        // int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1,0}};
        //           k =        0       1           2
        // 7,8,9,6,0,1,2,3,4,5
        for (int k = 0; k < numbers.length; k++) {
            for (int i = numbers[k].length - 1; i > 0; i++) {
                System.out.print(numbers[k][i]+" ");
                //        i=
            }
        }
 */