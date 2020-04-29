package day00_ReferenceQuiz;

public class Arraypractice {
    public static void main(String[] args) {
        int[][] numbers = {
                {5, 4, 3, 2, 1},
                {10, 11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };

        for (int[] each : numbers) {
            for (int eachElem : each) {
                if (eachElem % 2 == 0) {
                    continue;
                }
                System.out.println("Even: " + eachElem);

            }

        }
    }
}




