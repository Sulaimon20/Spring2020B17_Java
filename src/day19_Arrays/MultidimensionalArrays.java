package day19_Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };// it is going to multiply the numbers
        int x = myNumbers[1][2];
        System.out.println(x);// output gonna be 7
        // but with loop
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j]);// 1234567
            }
        }


    }
}
